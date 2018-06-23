package injection.component

import android.content.Context
import dagger.Component
import injection.module.AppMoudle
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppMoudle::class))
interface AppCmponent {
        fun  context():Context

}