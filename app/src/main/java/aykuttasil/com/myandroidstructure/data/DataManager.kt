package aykuttasil.com.myandroidstructure.data

import aykuttasil.com.myandroidstructure.data.local.entity.UserEntitiy
import aykuttasil.com.myandroidstructure.data.remote.ApiManager
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by aykutasil on 8.12.2017.
 */
@Singleton
class DataManager @Inject constructor(private val apiManager: ApiManager, private val appDatabase: AppDatabase) {

    fun addUserToLocal(user: UserEntitiy): Single<Long>? {
        return Single.create {
            try {
                it.onSuccess(appDatabase.geUserDao().insertItem(user))
            } catch (e: Exception) {
                it.onError(e)
            }
        }
    }

}