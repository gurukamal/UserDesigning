package com.example.userdesigning

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val DropDown=findViewById<ImageView>(R.id.iv_image);
        DropDown.setOnClickListener{
            DropDown.isEnabled(true)
        }

    }

}

private fun ImageView.isEnabled(b: Boolean) {
    visibility = if (b) {
        ImageView.VISIBLE
    } else
        ImageView.INVISIBLE
}


