package aykuttasil.com.myandroidstructure.ui.base

import android.os.Bundle
import com.hannesdorfmann.mosby3.mvp.MvpFragment
import com.hannesdorfmann.mosby3.mvp.MvpPresenter
import com.hannesdorfmann.mosby3.mvp.MvpView
import dagger.android.support.AndroidSupportInjection

/**
 * Created by aykutasil on 14.12.2017.
 */
abstract class BaseFragment<V : MvpView, P : MvpPresenter<V>> : MvpFragment<V, P>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

}