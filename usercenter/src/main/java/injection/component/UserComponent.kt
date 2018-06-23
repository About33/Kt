package injection.component

import com.kt.user.ui.activity.RegistActivity
import dagger.Component
import injection.module.PerCompoScope
import injection.moudle.UserMoulder

@PerCompoScope
@Component(dependencies = arrayOf(ActivityCmponent::class), modules = arrayOf(UserMoulder::class))
interface UserComponent {

    fun inject(activity: RegistActivity)


}