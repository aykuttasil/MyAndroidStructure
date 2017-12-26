package aykuttasil.com.myandroidstructure.ui.detail

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import aykuttasil.com.myandroidstructure.data.DataManager
import aykuttasil.com.myandroidstructure.data.local.entity.UserEntitiy
import javax.inject.Inject

/**
 * Created by aykutasil on 25.12.2017.
 */

class DetailViewModel @Inject constructor() : ViewModel() {

    //var mutableLiveDataUsers: LiveData<List<UserEntitiy>> = MutableLiveData()

    @Inject
    lateinit var mDataManager: DataManager

    fun getUsers(): LiveData<List<UserEntitiy>> {
        return mDataManager.getUsersToLocalLive()
    }
}
