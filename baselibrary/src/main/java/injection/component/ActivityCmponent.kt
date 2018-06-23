package injection.component

import android.app.Activity
import android.content.Context
import dagger.Component
import injection.module.ActivityMoudle
import injection.module.ActivityScope
import injection.module.AppMoudle
import javax.inject.Singleton

@ActivityScope
@Component(dependencies = arrayOf(AppCmponent::class), modules = arrayOf(ActivityMoudle::class))
interface ActivityCmponent {
    fun activity(): Activity

}