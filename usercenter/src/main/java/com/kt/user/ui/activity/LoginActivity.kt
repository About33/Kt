package com.kt.user.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.kt.user.R
import org.jetbrains.anko.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            padding = 30

            editText {
                hint = "请输入账号"
                textSize = 15f

            }

            editText {

                hint = "请输入密码"
                textSize = 15f
            }

            button {
                text = "登陆"
                setOnClickListener {
                    toast("登陆成功")

                }

            }







        }


    }
}
