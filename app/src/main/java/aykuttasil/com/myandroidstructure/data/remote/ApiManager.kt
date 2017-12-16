package aykuttasil.com.myandroidstructure.data.remote

import javax.inject.Singleton

/**
 * Created by aykutasil on 8.12.2017.
 */
class ApiManager(private var ad: String?) {

    fun getAd(): String? {
        return ad
    }

}