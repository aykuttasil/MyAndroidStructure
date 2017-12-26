package aykuttasil.com.myandroidstructure.ui.detail

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.util.Log
import aykuttasil.com.myandroidstructure.data.DataManager
import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter
import io.reactivex.disposables.CompositeDisposable
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * Created by aykutasil on 14.12.2017.
 */
class DetailPresenter @Inject constructor(private var dataManager: DataManager) : MvpBasePresenter<DetailContract.DetailView>(), DetailContract.DetailPresenter {

    private val compositeDisposable = CompositeDisposable()

    override fun showSomething() {
        launch(UI, block = {
            delay(3, TimeUnit.SECONDS)
            ifViewAttached { view ->
                view.showToast("Selamünaleyküm")
            }
        })
    }

    override fun detachView() {
        super.detachView()
        Log.i("aaa: ", "MainPresenter -> detachView()")
        compositeDisposable.dispose()
    }
}