package com.burakk.messageshareapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle: Bundle? = intent.extras
        val recMsg = bundle!!.getString("user_message")
        Toast.makeText(this,recMsg,Toast.LENGTH_SHORT).show()
        tvRecMsg.text = recMsg

    }
}