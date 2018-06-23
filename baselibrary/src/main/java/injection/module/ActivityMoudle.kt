package injection.module

import android.app.Activity
import android.content.Context
import common.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ActivityMoudle(private val activity: Activity) {
    @Provides

    fun providesActivity(): Activity {
        return activity

    }
}