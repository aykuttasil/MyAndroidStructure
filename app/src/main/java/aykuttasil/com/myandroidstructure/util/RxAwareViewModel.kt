package aykuttasil.com.myandroidstructure.util

import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by mertsimsek on 22/11/2017.
 */
open class RxAwareViewModel : ViewModel() {

    var disposables = CompositeDisposable()

    override fun onCleared() {
        super.onCleared()
        disposables.dispose()
    }
}