package aykuttasil.com.myandroidstructure.di.modules

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import aykuttasil.com.myandroidstructure.data.DataManager
import aykuttasil.com.myandroidstructure.data.remote.ApiManager
import aykuttasil.com.myandroidstructure.di.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by aykutasil on 8.12.2017.
 */
@Module
class AppModule {

    @Singleton
    @Provides
    @ApplicationContext
    internal fun provideContext(application: Application): Context {
        return application.applicationContext
    }

    @Singleton
    @Provides
    internal fun provideSharedPreference(application: Application): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(application.applicationContext)
    }

    @Singleton
    @Provides
    internal fun provideDataManager(apiManager: ApiManager): DataManager {
        return DataManager(apiManager)
    }
}
