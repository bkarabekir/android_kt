package com.burakk.messageshareapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.burakk.messageshareapp.adapters.HobbiesAdapter
import com.burakk.messageshareapp.R
import com.burakk.messageshareapp.models.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager // recyclerView.layoutManager library den geliyor.
        val adapter = HobbiesAdapter(this, Supplier.hobbies)
        recyclerView.adapter = adapter //burda xml e adapter i gonderdik.
    }
}