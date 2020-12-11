package com.example.lab2_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radiogroup.setOnCheckedChangeListener {group, checkedId ->
            if (checkedId == R.id.radio_male) {
                Toast.makeText(this, radio_male.text.toString(), Toast.LENGTH_SHORT).show()
                tv_selected.text = radio_male.text
            }
            if (checkedId ==R.id.radio_female) {
                Toast.makeText(this, radio_female.text.toString(), Toast.LENGTH_SHORT).show()
                tv_selected.text = radio_female.text
            }
        }
    }
}