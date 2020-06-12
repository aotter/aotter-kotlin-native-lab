package com.aotter.kotlin_native_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aotter.kotlin_native_android.adapter.AotterAdapter
import com.aotter.test.kotlin.native.createApplicationScreenMessage
import com.aotter.test.kotlin.native.getList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text.text = createApplicationScreenMessage()

        initRecyclerView()

    }

    private fun initRecyclerView() {

       val  aotterAdapter = AotterAdapter()

        val linearLayoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        aotterRecyclerView.layoutManager = linearLayoutManager

        aotterRecyclerView.adapter = aotterAdapter

        aotterAdapter.update(getList())


    }


}