package com.example.retrofitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            viewModel.getNewUserPost()
        }
        observeUserPostLiveData()
    }

    private fun observeUserPostLiveData() {
        return viewModel.userPostLiveData.observe(this, Observer {
            it.title.let {
                textView.text = it
            }
        })
    }
}