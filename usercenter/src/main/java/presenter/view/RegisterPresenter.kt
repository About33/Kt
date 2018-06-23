package presenter.view

import com.kt.base.presenter.BasePresenter
import rx.BaseSubscribe
import rx.Scheduler
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import server.impl.UserServer
import server.impl.UserServiceimpl
import java.util.*
import javax.inject.Inject

class RegisterPresenter @Inject constructor() : BasePresenter<RegiststerView>() {
     @Inject
    lateinit var userService: UserServer

    fun register(mobile: String, verifyCode: String, pwd: String) {

        /**
         * 业务逻辑
         * */

        userService.register(mobile, verifyCode, pwd)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object : BaseSubscribe<Boolean>() {
                    override fun onNext(t: Boolean) {
                        super.onNext(t)
                        mView.onregistresult(t)
                    }

                })


    }
}