package com.burakk.messageshareapp.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.burakk.messageshareapp.Constants
import com.burakk.messageshareapp.R
import com.burakk.messageshareapp.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    companion object {
        val TAG: String = MainActivity::class.java.simpleName //  it returns the name of the activity "MainActivity"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnSend.setOnClickListener {
            Log.i(/*MainActivity.*/TAG, "Toast button was clicked.")
            val msg: String = etUserMessage.text.toString()
            showToast(msg)
            //--Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(Constants.USER_MSG_KEY, msg)//for sending message to second activity.
            startActivity(intent)
        }
        btnShareToOtherApps.setOnClickListener {
            val msg: String = etUserMessage.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,msg)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent,"Please select app: "))
        }
        btnRecyclerView.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}
