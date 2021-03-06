package aykuttasil.com.myandroidstructure.ui.base

import android.os.Bundle
import android.support.v4.app.Fragment
import com.hannesdorfmann.mosby3.mvp.MvpActivity
import com.hannesdorfmann.mosby3.mvp.MvpPresenter
import com.hannesdorfmann.mosby3.mvp.MvpView
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

/**
 * Created by aykutasil on 9.12.2017.
 */
abstract class BaseActivity<V : MvpView, P : MvpPresenter<V>> : MvpActivity<V, P>(), HasSupportFragmentInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    override fun supportFragmentInjector(): DispatchingAndroidInjector<Fragment> {
        return dispatchingAndroidInjector
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        // AppInjector sınıfı kullanıldığı için Activity ve Fragment dependency lerini bu sınıf inject eder.
        // AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

}