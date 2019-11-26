package com.forward.exampleviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var model: MainActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        model = ViewModelProviders.of(this)[MainActivityViewModel::class.java]


        btn.setOnClickListener {
            model.setInput(input.text.toString())
        }

        model.getInput().observe(this, Observer<String> {texto->
            result.text = texto
        })

    }
}
