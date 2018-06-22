package com.kt.user.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.kt.user.R
import kotlinx.android.synthetic.main.activity_regist.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast
import org.jetbrains.anko.tvView


class RegistActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist)

        register.setOnClickListener {
            startActivity(intentFor<LoginActivity>())

        }

    }


}
