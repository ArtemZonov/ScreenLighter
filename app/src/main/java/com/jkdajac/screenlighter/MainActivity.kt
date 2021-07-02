package com.jkdajac.screenlighter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

btRed.setOnClickListener {
    var intent = Intent (this, RedActivity::class.java)
    startActivity(intent)
}
        btGreen.setOnClickListener {
            var intent = Intent (this, GreenActivity::class.java)
            startActivity(intent)
        }
        btYellow.setOnClickListener {
            var intent = Intent (this, YellowActivity::class.java)
            startActivity(intent)
        }
        btBlue.setOnClickListener {
            var intent = Intent (this, BlueActivity::class.java)
            startActivity(intent)
        }
        btWhite.setOnClickListener {
            var intent = Intent (this, WhiteActivity::class.java)
            startActivity(intent)
        }

    }



}


