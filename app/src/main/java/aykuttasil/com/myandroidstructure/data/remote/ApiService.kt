package aykuttasil.com.myandroidstructure.data.remote

import aykuttasil.com.myandroidstructure.data.remote.model.User
import io.reactivex.Single
import retrofit2.http.GET

/**
 * Created by aykutasil on 20.12.2017.
 */
interface ApiService {

    @GET("user")
    fun getUser(id: String): Single<User>
}