package aykuttasil.com.myandroidstructure.ui.main

import android.content.Context
import aykuttasil.com.myandroidstructure.data.remote.ApiManager
import aykuttasil.com.myandroidstructure.di.ActivityContext
import dagger.Module
import dagger.Provides

/**
 * Created by aykutasil on 13.12.2017.
 */
@Module
class MainActivityModule {

    @Provides
    fun providerApiManager(): ApiManager {
        return ApiManager("Benim Adım Aykut")
    }

    @ActivityContext
    @Provides
    fun providerContext(context: Context): Context {
        return context
    }


}
