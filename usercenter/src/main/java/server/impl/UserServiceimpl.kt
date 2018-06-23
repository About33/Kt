package server.impl

import rx.Observable

class UserServiceimpl : UserServer {
    override fun register(mobile: String, verfiyCode: String, pwd: String): Observable<Boolean> {

        return Observable.just(true)


    }
}