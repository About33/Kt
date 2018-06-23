package data.api

import data.api.protocol.RegisterReq
import data.net.protocal.BaseRespose
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observer

interface UserApi {
    @POST("userCenter/register")
    fun register(@Body req: RegisterReq): Observer<BaseRespose<String>>

}