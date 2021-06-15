package com.priyanka.patel.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.priyanka.patel.ApplicationClass
import com.priyanka.patel.R

class SplashActivity : AppCompatActivity() {

    private var mHandler: Handler? = null
    private val delay: Long = 3000;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        mHandler = Handler()
        mHandler!!.postDelayed(runnable, delay)
    }

    val runnable: Runnable = Runnable {
        if (!isFinishing) {

            val isLogin = ApplicationClass.mInstance?.sharedPreferences?.getBoolean(getString(R.string.PREF_LOGIN), false)

            if(isLogin!!){
                val mMainActivity = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(mMainActivity)
                finish()
            }else{
                val mMainActivity = Intent(this@SplashActivity, LoginActivity::class.java)
                startActivity(mMainActivity)
                finish()
            }

        }
    }


}
