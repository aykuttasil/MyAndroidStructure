package aykuttasil.com.myandroidstructure.ui.detail

import android.content.Context
import aykuttasil.com.myandroidstructure.data.DataManager
import aykuttasil.com.myandroidstructure.di.ActivityContext
import aykuttasil.com.myandroidstructure.di.PerActivity
import dagger.Module
import dagger.Provides

/**
 * Created by aykutasil on 14.12.2017.
 */
@Module
class DetailActivityModule {

    @ActivityContext
    @Provides
    fun providerContext(context: DetailActivity): Context {
        return context
    }

    @PerActivity
    @Provides
    fun provideDetailPresenter(dataManager: DataManager): DetailPresenter {
        return DetailPresenter(dataManager)
    }
}