package aykuttasil.com.myandroidstructure.ui.detail

import android.content.Context
import aykuttasil.com.myandroidstructure.di.ActivityContext
import dagger.Module
import dagger.Provides

/**
 * Created by aykutasil on 14.12.2017.
 */
@Module
class DetailActivityModule {

    @ActivityContext
    @Provides
    fun providerContext(context: Context): Context {
        return context
    }


}