package aykuttasil.com.myandroidstructure.ui.detail

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import java.util.concurrent.TimeUnit

/**
 * Created by aykutasil on 14.12.2017.
 */
class DetailPresenter : MvpBasePresenter<DetailContract.DetailView>(), DetailContract.DetailPresenter {

    override fun showSomething() {
        launch(UI, block = {
            delay(3, TimeUnit.SECONDS)
            ifViewAttached { view ->
                view.showToast("Selamünaleyküm")
            }
        })
    }
}