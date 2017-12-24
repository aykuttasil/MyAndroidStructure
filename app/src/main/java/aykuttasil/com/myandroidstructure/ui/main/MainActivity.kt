package aykuttasil.com.myandroidstructure.ui.main

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.util.Log
import aykuttasil.com.myandroidstructure.R
import aykuttasil.com.myandroidstructure.data.local.entity.UserEntitiy
import aykuttasil.com.myandroidstructure.data.remote.ApiManager
import aykuttasil.com.myandroidstructure.ui.base.BaseActivity
import aykuttasil.com.myandroidstructure.ui.detail.DetailActivity
import aykuttasil.com.myandroidstructure.ui.tabs.TabsActivity
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.OkHttpClient
import okhttp3.Request
import org.jetbrains.anko.longToast
import org.jetbrains.anko.sdk25.coroutines.onClick
import java.io.IOException
import java.util.*
import javax.inject.Inject

class MainActivity : BaseActivity<MainContact.MainView, MainPresenter>(), MainContact.MainView {

    @Inject
    lateinit var sharedPreference: SharedPreferences

    @Inject
    lateinit var okHttp: OkHttpClient

    @Inject
    lateinit var apiManager: ApiManager

    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun createPresenter(): MainPresenter {
        return mainPresenter
    }

    @SuppressLint("ApplySharedPref")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowProgress.setOnClickListener({
            sharedPreference.edit().putString("Ad", "Aykut Asil 123").commit()

            okHttp.newCall(Request.Builder()
                    .url("http://www.aykutasil.com")
                    .build())
                    .enqueue(object : okhttp3.Callback {
                        override fun onFailure(call: okhttp3.Call?, e: IOException?) {
                            println(e)
                        }

                        override fun onResponse(call: okhttp3.Call?, response: okhttp3.Response?) {
                            println(response?.body().toString())
                        }
                    })

            apiManager.getUser("user id")
                    .subscribe({
                        println(it)
                    }, {
                        it.printStackTrace()
                    })

            presenter.doLogin()
            Log.i("aaa: ", "" + mainPresenter.hashCode())
        })

        btnGoDetail.onClick {
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            //intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

        btnGoTabs.onClick {
            val intent = Intent(this@MainActivity, TabsActivity::class.java)
            startActivity(intent)
        }

        btnSaveUser.onClick {
            try {
                presenter.addUser(UserEntitiy(Random().nextLong(), "Aykut", 26, "İstanbul", "aykuttasil@gmail.com"));
                //appDatabase.geUserDao().insertItem(UserEntitiy(Random().nextLong(), "Aykut", 26, "İstanbul", "aykuttasil@gmail.com"))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }


    override fun showProgress() {
        Snackbar.make(btnShowProgress, sharedPreference.getString("Ad", "default value"), Snackbar.LENGTH_SHORT).show()
    }

    override fun showMessage(msg: String) {
        longToast(msg)
    }

    override fun onStop() {
        super.onStop()
        Log.i("aaa", "MainActivity -> onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("aaa", "MainActivity -> onDestroy()")
    }
}
