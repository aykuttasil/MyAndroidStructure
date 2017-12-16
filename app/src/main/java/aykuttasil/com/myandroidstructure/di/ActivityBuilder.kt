package aykuttasil.com.myandroidstructure.di

import aykuttasil.com.myandroidstructure.ui.detail.DetailActivity
import aykuttasil.com.myandroidstructure.ui.detail.DetailActivityModule
import aykuttasil.com.myandroidstructure.ui.main.MainActivity
import aykuttasil.com.myandroidstructure.ui.main.MainActivityModule
import aykuttasil.com.myandroidstructure.ui.tabs.TabsActivity
import aykuttasil.com.myandroidstructure.ui.tabs.TabsActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by aykutasil on 13.12.2017.
 */
@Module
abstract class ActivityBuilder {

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    internal abstract fun bindMainActivity(): MainActivity

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(DetailActivityModule::class))
    internal abstract fun bindDetailActivity(): DetailActivity

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(TabsActivityModule::class))
    internal abstract fun bindTabsActivity(): TabsActivity
}