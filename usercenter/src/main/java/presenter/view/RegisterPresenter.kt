package presenter.view

import com.kt.base.presenter.BasePresenter
import rx.BaseSubscribe
import rx.Scheduler
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import server.impl.UserServiceimpl
import java.util.*

class RegisterPresenter : BasePresenter<RegiststerView>() {

    fun register(mobile: String, verifyCode: String, pwd: String) {

        /**
         * 业务逻辑
         * */
        val userService = UserServiceimpl()
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