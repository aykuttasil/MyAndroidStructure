package aykuttasil.com.myandroidstructure.ui.detail

import aykuttasil.com.myandroidstructure.ui.base.BaseMvpView

/**
 * Created by aykutasil on 14.12.2017.
 */
interface DetailContract {
    interface DetailView : BaseMvpView {
    }

    interface DetailPresenter {
        fun showSomething()
    }
}