package com.kt.base.presenter

import com.kt.base.presenter.view.BaseView

class BasePresenter<T : BaseView> {
    lateinit var mView: T


}