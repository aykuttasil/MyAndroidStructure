package aykuttasil.com.myandroidstructure.ui.main

import aykuttasil.com.myandroidstructure.data.local.entity.UserEntitiy
import aykuttasil.com.myandroidstructure.ui.base.BaseMvpView

/**
 * Created by aykutasil on 7.12.2017.
 */
interface MainContact {

    interface MainPresenter {
        fun doLogin()

        fun addUser(user: UserEntitiy)
    }

    interface MainView : BaseMvpView {

    }

}