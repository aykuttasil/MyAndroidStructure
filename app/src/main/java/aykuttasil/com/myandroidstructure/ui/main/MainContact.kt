package aykuttasil.com.myandroidstructure.ui.main

import com.hannesdorfmann.mosby3.mvp.MvpView

/**
 * Created by aykutasil on 7.12.2017.
 */
interface MainContact {

    interface MainPresenter {
        fun doLogin()
    }

    interface MainView : MvpView {
        fun showProgress()
    }

}