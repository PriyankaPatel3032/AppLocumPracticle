package com.priyanka.patel.activities

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuBuilder
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.priyanka.kotlinstructurecorotines.Adapter.DataListAdapter
import com.priyanka.patel.ApplicationClass
import com.priyanka.patel.R
import com.priyanka.patel.Utils.Utils
import com.priyanka.patel.databinding.ActivityMainBinding
import com.priyanka.patel.models.Data.DataResponseItem
import com.priyanka.patel.mvvm.list.DataListViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var dataList:ArrayList<DataResponseItem>
    private val dataListViewModel: DataListViewModel by viewModel()
    private lateinit var adapter: DataListAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        ApplicationClass.setmInstance(application as ApplicationClass)
        ApplicationClass.mInstance!!.setActity(this)

        binding?.viewModel = dataListViewModel
        dataList = ArrayList()

        binding.toolbar.setTitle("Practical Task");
        binding.toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(binding.toolbar);

        getList()
        setUpObserver()

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.toolbar_main_menu, menu)
        if (menu is MenuBuilder) {
            menu.setOptionalIconsVisible(true)
        }
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.logout -> {

                val mMainActivity = Intent(this, LoginActivity::class.java)
                startActivity(mMainActivity)
                ApplicationClass.mInstance?.savePreferenceDataBoolean(resources.getString(R.string.PREF_LOGIN),false)

                finish()
                return true
            }

            else -> super.onOptionsItemSelected(item)
        }
        return true
    }
    private fun setUpObserver() {
        dataListViewModel.showloding.observe(this, Observer {
            if (!it)
                binding.progressBar.visibility = View.GONE
        })
        dataListViewModel.storeData.observe(this, Observer { data ->

            dataList.addAll(data)
            setUpUi()

        })

    }

    //call api
    private fun getList() {
        if (Utils.isOnline(this, true)) {
            dataListViewModel.getDataList()
        }else{
            binding.progressBar.visibility= View.GONE

        }
    }
    private fun setUpUi() {
        binding.rvList.layoutManager = LinearLayoutManager(this)
        adapter = DataListAdapter(dataList,this)
        binding.rvList.adapter = adapter
    }

    fun passImageUrl(data: DataResponseItem) {

        val intent = Intent(this, ImageDetailActivity::class.java)

        intent.putExtra(resources.getString(R.string.IMAGE_URL),data.url)
        intent.putExtra(resources.getString(R.string.IMAGE_PLASH_HOLDER),data.thumbnailUrl)
        startActivity(intent)
    }


}
