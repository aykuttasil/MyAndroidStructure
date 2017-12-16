package aykuttasil.com.myandroidstructure.ui.main

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter

/**
 * Created by aykutasil on 7.12.2017.
 */
class MainPresenter : MvpBasePresenter<MainContact.MainView>(), MainContact.MainPresenter {

    override fun doLogin() {
        ifViewAttached { view ->
            view.showProgress()
        }

    }

}