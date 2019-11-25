package com.example.gradletest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_hi.setTextColor(resources.getColor(R.color.text_color));
        val appUrl = BuildConfig.APP_URL
        tv_hi.setText(appUrl)
        Toast.makeText(this, Constants.appType, Toast.LENGTH_SHORT).show()
    }
}
