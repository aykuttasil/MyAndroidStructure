package aykuttasil.com.myandroidstructure.ui.main

import aykuttasil.com.myandroidstructure.data.DataManager
import aykuttasil.com.myandroidstructure.data.local.entity.UserEntitiy
import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by aykutasil on 7.12.2017.
 */
class MainPresenter @Inject constructor(var dataManager: DataManager) : MvpBasePresenter<MainContact.MainView>(), MainContact.MainPresenter {

    override fun addUser(user: UserEntitiy) {
        dataManager.addUserToLocal(user)!!
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ rsp ->
                    run {
                        ifViewAttached { view ->
                            view.showMessage(rsp.toString())
                        }
                    }
                }, {
                    it.printStackTrace()
                })
    }

    override fun doLogin() {
        ifViewAttached { view ->
            view.showProgress()
        }

    }

}