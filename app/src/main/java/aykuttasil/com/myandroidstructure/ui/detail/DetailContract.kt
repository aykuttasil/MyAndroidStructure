package aykuttasil.com.myandroidstructure.ui.detail

import com.hannesdorfmann.mosby3.mvp.MvpView

/**
 * Created by aykutasil on 14.12.2017.
 */
interface DetailContract {
    interface DetailView : MvpView {

        fun showToast(msg: String?)

    }

    interface DetailPresenter {
        fun showSomething()
    }
}