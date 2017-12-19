package aykuttasil.com.myandroidstructure.di.modules

import aykuttasil.com.myandroidstructure.data.remote.ApiService
import aykuttasil.com.myandroidstructure.data.remote.GithubApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by aykutasil on 9.12.2017.
 */
@Module
class ApiModule {

    @Provides
    @Singleton
    internal fun provideGithubApi(retrofit: Retrofit): GithubApiService = retrofit.create(GithubApiService::class.java)

    @Provides
    @Singleton
    internal fun provideApi(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)
}