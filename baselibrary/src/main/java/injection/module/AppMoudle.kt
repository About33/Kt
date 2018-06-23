package injection.module

import android.content.Context
import common.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppMoudle(private val context: BaseApplication) {
    @Provides
    @Singleton
    fun providesContext(): Context {
        return context

    }
}