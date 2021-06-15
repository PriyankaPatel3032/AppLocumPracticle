package com.priyanka.patel

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import com.priyanka.patel.Api.appmodules
import org.koin.core.context.startKoin

class ApplicationClass : Application() {
    var sharedPreferences: SharedPreferences? = null

    var activity: AppCompatActivity? = null
    override fun onCreate() {
        super.onCreate()
        mInstance = this
        sharedPreferences =
            getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)
        startKoin {
            modules(listOf(appmodules))
        }
    }

    fun setActity(activity: AppCompatActivity) {
        this.activity = activity
    }

    fun getactivity(): AppCompatActivity? {
        return this!!.activity
    }

    companion object {
        var mInstance: ApplicationClass? = null
        fun getmInstance(): ApplicationClass? {
            return mInstance
        }

        fun setmInstance(mInstance: ApplicationClass?) {
            Companion.mInstance = mInstance
        }

        private operator fun get(context: Context): ApplicationClass {
            return context.applicationContext as ApplicationClass
        }

        fun create(context: Context): ApplicationClass {
            return get(context)
        }
    }

    fun savePreferenceDataString(key: String?, value: String?) {
        val editor = sharedPreferences!!.edit()
        editor.putString(key, value)
        editor.commit()
    }

    fun savePreferenceDataBoolean(key: String?, value: Boolean?) {
        val editor = sharedPreferences!!.edit()
        editor.putBoolean(key, value!!)
        editor.commit()
    }

    fun savePreferenceDataLong(key: String?, value: Long?) {
        val editor = sharedPreferences!!.edit()
        editor.putLong(key, value!!)
        editor.commit()
    }

    fun savePreferenceDataInt(key: String?, value: Int) {
        val editor = sharedPreferences!!.edit()
        editor.putInt(key, value)
        editor.commit()
    }

    fun clearePreferenceData() {
        val editor = sharedPreferences!!.edit()
        editor.clear()
        editor.commit()
    }


}