package aykuttasil.com.myandroidstructure.ui.detail

import android.content.Context
import aykuttasil.com.myandroidstructure.data.remote.ApiManager
import aykuttasil.com.myandroidstructure.di.ActivityContext
import dagger.Module
import dagger.Provides
import javax.inject.Scope

/**
 * Created by aykutasil on 14.12.2017.
 */
@Module
class DetailActivityModule {
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