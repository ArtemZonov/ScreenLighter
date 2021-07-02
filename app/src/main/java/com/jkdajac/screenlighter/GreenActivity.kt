package com.jkdajac.screenlighter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_green.*
import kotlinx.android.synthetic.main.activity_red.*

class GreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_green)

        ivBackGreen.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            finish()
        }

    }
}