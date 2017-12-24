package aykuttasil.com.myandroidstructure

import android.content.Context
import android.support.multidex.MultiDex
import aykuttasil.com.myandroidstructure.di.components.AppComponent
import aykuttasil.com.myandroidstructure.di.components.DaggerAppComponent
import com.facebook.stetho.Stetho
import dagger.android.AndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.DaggerApplication


/**
 * Created by aykutasil on 7.12.2017.
 */
class App : DaggerApplication(), HasActivityInjector {

    lateinit var appComponent: AppComponent

    companion object {
        fun getInstance(context: Context): App {
            return context.applicationContext as App
        }
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        appComponent = DaggerAppComponent.builder()
                .application(this)
                .build()
        return appComponent
    }

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
        }
    }

    /*
    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): DispatchingAndroidInjector<Activity> {
        return activityDispatchingAndroidInjector
    }
    */


    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

}