package ui.activity

import com.kt.base.presenter.BasePresenter
import com.kt.base.presenter.view.BaseView

open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    override fun showLoding() {

    }

    override fun hideLoding() {

    }

    override fun onError() {

    }


    lateinit var mPresenter: T

}