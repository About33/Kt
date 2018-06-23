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
import presenter.view.RegisterPresenter
import presenter.view.RegiststerView
import ui.activity.BaseMvpActivity


class RegistActivity : BaseMvpActivity<RegisterPresenter>(), RegiststerView {
    override fun OnRegisterResult(result: Boolean) {
        toast("成功")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist)
        mPresenter = RegisterPresenter()
        mPresenter.mView = this;

        register.setOnClickListener {
            mPresenter.Reister("", "")


        }


    }

}



