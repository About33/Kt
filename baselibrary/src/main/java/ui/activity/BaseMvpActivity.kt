package ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import com.kt.base.presenter.BasePresenter
import com.kt.base.presenter.view.BaseView
import common.BaseApplication
import injection.component.ActivityCmponent
import injection.component.DaggerActivityCmponent
import injection.module.ActivityMoudle
import javax.inject.Inject

open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    override fun showLoding() {

    }

    override fun hideLoding() {

    }

    override fun onError() {

    }

    @Inject
    lateinit var mPresenter: T

    lateinit var activityComponent: ActivityCmponent


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initInjectActivity()

    }

    private fun initInjectActivity() {

        activityComponent=   DaggerActivityCmponent.builder().appCmponent((application as BaseApplication).appCmponent).activityMoudle(ActivityMoudle(this)).build()

    }


}