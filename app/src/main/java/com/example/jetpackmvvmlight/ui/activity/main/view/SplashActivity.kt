package com.example.jetpackmvvmlight.ui.activity.main.view

import android.os.Bundle
import com.example.commonlib.base.BaseActivity
import com.example.jetpackmvvmlight.R

class SplashActivity : BaseActivity(R.layout.activity_splash) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setBackgroundDrawable(null)
    }

    override fun initData() {
        startActivity(MainActivity::class.java)
        finish()
    }

}