package injection.moudle

import dagger.Module
import dagger.Provides
import server.impl.UserServer
import server.impl.UserServiceimpl

@Module
class UserMoulder {
    /** 实例化*/
    @Provides
    fun providesUserService(service: UserServiceimpl): UserServer {
        return service


    }

}