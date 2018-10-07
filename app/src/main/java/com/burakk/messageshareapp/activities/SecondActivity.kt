package com.burakk.messageshareapp.activities

import android.os.Bundle
import android.support.constraint.Constraints
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.burakk.messageshareapp.Constants
import com.burakk.messageshareapp.R
import com.burakk.messageshareapp.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle: Bundle? = intent.extras
        val recMsg = bundle!!.getString(Constants.USER_MSG_KEY)
        showToast(recMsg)
        tvRecMsg.text = recMsg

    }
}