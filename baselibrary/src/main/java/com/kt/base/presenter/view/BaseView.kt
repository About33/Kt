package com.kt.base.presenter.view

/**
 * 接口回调
 * */
interface BaseView {
    //加载对话框显示
    fun showLoding()

    //加载对话框隐藏
    fun hideLoding()

    //处理错误信息
    fun onError()


}