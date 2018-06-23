package data.api.repository

import data.api.UserApi
import data.api.protocol.RegisterReq
import data.net.RetrofitFactory
import data.net.protocal.BaseRespose
import rx.Observer
import javax.inject.Inject

/**
 * 访问网络数据
 * */
class UserRepository @Inject constructor() {
    fun register(mobile: String, pwd: String, verfiyCode: String): Observer<BaseRespose<String>> {
        return RetrofitFactory.instance.create(UserApi::class.java)
                .register(RegisterReq(mobile, pwd, verfiyCode))

    }
}