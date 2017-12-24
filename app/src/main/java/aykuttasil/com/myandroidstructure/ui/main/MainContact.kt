package aykuttasil.com.myandroidstructure.ui.main

import aykuttasil.com.myandroidstructure.data.local.entity.UserEntitiy
import com.hannesdorfmann.mosby3.mvp.MvpView

/**
 * Created by aykutasil on 7.12.2017.
 */
interface MainContact {

    interface MainPresenter {
        fun doLogin()

        fun addUser(user: UserEntitiy)
    }

    interface MainView : MvpView {
        fun showProgress()

        fun showMessage(msg: String)

    }

}