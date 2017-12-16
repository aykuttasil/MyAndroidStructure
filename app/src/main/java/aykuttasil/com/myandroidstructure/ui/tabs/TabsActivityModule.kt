package aykuttasil.com.myandroidstructure.ui.tabs


import android.support.v4.app.FragmentManager
import dagger.Module
import dagger.Provides

/**
 * Created by aykutasil on 14.12.2017.
 */
@Module(includes = arrayOf(TabsBuilder::class))
class TabsActivityModule {

    @Provides
    fun providerTabsPagerAdapter(fragmentManager: FragmentManager): TabsPagerAdapter {
        return TabsPagerAdapter(fragmentManager)
    }

    @Provides
    fun providerFragmentManager(activity: TabsActivity): FragmentManager {
        return activity.supportFragmentManager
    }

}