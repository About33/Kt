package server.impl

import data.api.repository.UserRepository
import rx.Observable
import javax.inject.Inject

class UserServiceimpl @Inject constructor() : UserServer {
    @Inject
    lateinit var repository: UserRepository

    override fun register(mobile: String, verfiyCode: String, pwd: String): Observable<Boolean> {

        return Observable.just(true)


    }
}