package aykuttasil.com.myandroidstructure.ui.main

import android.content.Context
import aykuttasil.com.myandroidstructure.data.DataManager
import aykuttasil.com.myandroidstructure.di.ActivityContext
import dagger.Module
import dagger.Provides

/**
 * Created by aykutasil on 13.12.2017.
 */
@Module
class MainActivityModule {

    @ActivityContext
    @Provides
    fun providerContext(context: MainActivity): Context {
        return context
    }

    @ActivityContext
    @Provides
    fun provideMainPresenter(dataManager: DataManager): MainPresenter {
        return MainPresenter(dataManager)
    }

}
