package aykuttasil.com.myandroidstructure.di.modules

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import aykuttasil.com.myandroidstructure.di.ViewModelFactory
import aykuttasil.com.myandroidstructure.ui.detail.DetailViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import iammert.com.frekans.di.key.ViewModelKey

/**
 * Created by mertsimsek on 12/11/2017.
 */
@Module
internal abstract class ViewModelModule {

    @IntoMap
    @Binds
    @ViewModelKey(DetailViewModel::class)
    abstract fun provideDetailVieWModel(detailViewModel: DetailViewModel): ViewModel

    /*
    @IntoMap
    @Binds
    @ViewModelKey(TrendingViewModel::class)
    abstract fun provideTrendingViewModel(trendingViewModel: TrendingViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(SearchViewModel::class)
    abstract fun provideSearchViewModel(searchViewModel: SearchViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(FavouriteViewModel::class)
    abstract fun provideFavouriteViewModel(favouriteViewModel: FavouriteViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(SettingsViewModel::class)
    abstract fun provideSettingsViewModel(settingsViewModel: SettingsViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(MainViewModel::class)
    abstract fun provideMainViewModel(mainViewModel: MainViewModel): ViewModel
    */

    @Binds
    abstract fun provideViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}

