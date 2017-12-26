package aykuttasil.com.myandroidstructure.ui.main

import android.util.Log
import aykuttasil.com.myandroidstructure.data.DataManager
import aykuttasil.com.myandroidstructure.data.local.entity.UserEntitiy
import aykuttasil.com.myandroidstructure.di.PerActivity
import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by aykutasil on 7.12.2017.
 */
@PerActivity
class MainPresenter @Inject constructor(private var dataManager: DataManager) : MvpBasePresenter<MainContact.MainView>(), MainContact.MainPresenter {

    private val compositeDisposable = CompositeDisposable()

    override fun addUser(user: UserEntitiy) {
        compositeDisposable.add(dataManager.addUserToLocal(user)!!
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
                }))
    }

    override fun doLogin() {
        ifViewAttached { view ->
            view.showSnackBar("qwerty")
        }
    }

    override fun detachView() {
        super.detachView()
        Log.i("aaa: ", "MainPresenter -> detachView()")
        compositeDisposable.dispose()
    }

}