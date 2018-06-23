package common

import android.app.Application
import injection.component.AppCmponent
import injection.component.DaggerAppCmponent
import injection.module.AppMoudle


class BaseApplication: Application() {

    lateinit var appCmponent: AppCmponent

    override fun onCreate() {
        super.onCreate()

            initAppInjection()
    }

    private fun initAppInjection() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        appCmponent =    DaggerAppCmponent.builder().appMoudle(AppMoudle(this)).build()

    }
}