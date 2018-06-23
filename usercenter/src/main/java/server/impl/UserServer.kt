package server.impl

import rx.Observable
import java.util.*


/**
 * 用户注册
 * */
interface UserServer {
    fun register(mobile: String, pwd: String, verfiyCode: String): Observable<Boolean>

}