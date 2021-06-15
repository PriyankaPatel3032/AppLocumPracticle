package com.priyanka.patel.activities

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.priyanka.patel.ApplicationClass
import com.priyanka.patel.R
import com.priyanka.patel.databinding.ActivityLoginBinding
import com.priyanka.patel.mvvm.LoginViewModel
import java.util.*


class LoginActivity : AppCompatActivity() {

    lateinit var binding:ActivityLoginBinding
    private var loginViewModel: LoginViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)

        binding = DataBindingUtil. setContentView(this, R.layout.activity_login)

        binding.setLoginViewModel(loginViewModel);

        loginViewModel!!.user.observe(this,
            Observer { loginUser ->

                if (TextUtils.isEmpty(Objects.requireNonNull(loginUser).getStrEmailAddress())) {
                    binding.etEmail.setError(resources.getString(R.string.str_email_enter))
                    binding.etEmail.requestFocus()
                } else if (!loginUser.isEmailValid()) {
                    binding.etEmail.setError(resources.getString(R.string.str_valid_email_enter))
                    binding.etEmail.requestFocus()
                }else if(!binding.etEmail.text.toString().equals("hello@yopmail.com")){
                    binding.etEmail.setError(resources.getString(R.string.str_proper_email_enter))
                    binding.etEmail.requestFocus()
                }
                    else if (TextUtils.isEmpty(Objects.requireNonNull(loginUser).getStrPassword())) {
                    binding.etPassword.setError(resources.getString(R.string.str_pls_enter_password))
                    binding.etPassword.requestFocus()
                }
                else if (!loginUser.isPasswordLengthGreaterThan5()) {
                    binding.etPassword.setError(resources.getString(R.string.str_vaid_password))
                    binding.etPassword.requestFocus()
                }
                else if(!binding.etPassword.text.toString().equals("Password@123")){
                    binding.etPassword.setError(resources.getString(R.string.str_proper_password_enter))
                    binding.etPassword.requestFocus()
                } else {
                    moveToMain()
                }
            })
    }

    private fun moveToMain() {

        ApplicationClass.mInstance?.savePreferenceDataBoolean(resources.getString(R.string.PREF_LOGIN),true)
        var intent =Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()

    }
}