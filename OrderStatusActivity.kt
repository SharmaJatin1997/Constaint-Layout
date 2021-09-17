package com.app.sweetzy.ui.home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.app.sweetzy.base.BaseActivity
import com.app.sweetzy.databinding.ActivityOrderStatusBinding
import com.app.sweetzy.ui.authentication.SignInActivity

class OrderStatusActivity : BaseActivity<ActivityOrderStatusBinding>() {

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, OrderStatusActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun getViewBinding(): ActivityOrderStatusBinding {
        return ActivityOrderStatusBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initListener()
    }

    private fun initListener() {
        binding.apply {
            ivBack.setOnClickListener {
                MainActivity.start(this@OrderStatusActivity)
                finish()
            }
        }
    }
}