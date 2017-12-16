package aykuttasil.com.myandroidstructure.ui.tabs

import aykuttasil.com.myandroidstructure.ui.tabs.pages.tab1.Tab1
import aykuttasil.com.myandroidstructure.ui.tabs.pages.tab1.Tab1Module
import aykuttasil.com.myandroidstructure.ui.tabs.pages.tab1.Tab2
import aykuttasil.com.myandroidstructure.ui.tabs.pages.tab1.Tab2Module
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by aykutasil on 14.12.2017.
 */
@Module
abstract class TabsBuilder {


    @ContributesAndroidInjector(modules = arrayOf(Tab1Module::class))
    internal abstract fun bindTab1(): Tab1

    @ContributesAndroidInjector(modules = arrayOf(Tab2Module::class))
    internal abstract fun bindTab2(): Tab2

}