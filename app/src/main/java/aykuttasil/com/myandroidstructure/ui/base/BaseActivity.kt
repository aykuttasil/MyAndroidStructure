package aykuttasil.com.myandroidstructure.ui.base

import android.os.Bundle
import com.hannesdorfmann.mosby3.mvp.MvpActivity
import com.hannesdorfmann.mosby3.mvp.MvpPresenter
import com.hannesdorfmann.mosby3.mvp.MvpView
import dagger.android.AndroidInjection

/**
 * Created by aykutasil on 9.12.2017.
 */
abstract class BaseActivity<V : MvpView, P : MvpPresenter<V>> : MvpActivity<V, P>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

}