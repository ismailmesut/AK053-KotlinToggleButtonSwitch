package com.ismailmesutmujde.kotlintogglebuttonswitch

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlintogglebuttonswitch.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.switch1.setOnCheckedChangeListener{ compoundButton, b->
            if (b) {
                Log.e("Switch", "ON")
            } else {
                Log.e("Switch", "OFF")
            }
        }

        bindingMain.toggleButton.setOnCheckedChangeListener{ compoundButton, b->
            if (b) {
                Log.e("Toggle Button", "ON")
            } else {
                Log.e("Toggle Button", "OFF")
            }
        }

        bindingMain.button.setOnClickListener {
            val switchStatus = bindingMain.switch1.isChecked
            val toggleButtonStatus = bindingMain.toggleButton.isChecked

            Log.e("Switch Status", switchStatus.toString())
            Log.e("Toggle Button Status", toggleButtonStatus.toString())
        }

    }
}