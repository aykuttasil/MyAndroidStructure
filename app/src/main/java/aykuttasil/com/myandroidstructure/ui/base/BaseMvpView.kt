package aykuttasil.com.myandroidstructure.ui.base

import com.hannesdorfmann.mosby3.mvp.MvpView

/**
 * Created by aykutasil on 25.12.2017.
 */
interface BaseMvpView : MvpView {
    fun showMessage(msg: String?)

    fun showErrorMessage(msg: String?)

    fun showToast(msg: String?)

    fun showSnackBar(msg: String?)
}