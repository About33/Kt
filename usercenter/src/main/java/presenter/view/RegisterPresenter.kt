package presenter.view

import com.kt.base.presenter.BasePresenter

class RegisterPresenter : BasePresenter<RegiststerView>() {

    fun Reister(mobile: String, verifyCode: String) {

        mView.OnRegisterResult(true)
    }
}