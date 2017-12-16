package aykuttasil.com.myandroidstructure.ui.main

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.widget.Toast
import aykuttasil.com.myandroidstructure.R
import aykuttasil.com.myandroidstructure.data.remote.ApiManager
import aykuttasil.com.myandroidstructure.ui.base.BaseActivity
import aykuttasil.com.myandroidstructure.ui.detail.DetailActivity
import aykuttasil.com.myandroidstructure.ui.tabs.TabsActivity
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.OkHttpClient
import okhttp3.Request
import org.jetbrains.anko.sdk25.coroutines.onClick
import java.io.IOException
import javax.inject.Inject

class MainActivity : BaseActivity<MainContact.MainView, MainPresenter>(), MainContact.MainView {

    @Inject
    lateinit var sharedPreference: SharedPreferences

    @Inject
    lateinit var apiManager: ApiManager

    @Inject
    lateinit var okHttp: OkHttpClient

    override fun createPresenter(): MainPresenter {
        return MainPresenter()
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

            presenter.doLogin()
        })

        btnGoDetail.onClick {
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            startActivity(intent)
        }

        btnGoTabs.onClick {
            val intent = Intent(this@MainActivity, TabsActivity::class.java)
            startActivity(intent)
        }
    }


    override fun showProgress() {
        Snackbar.make(btnShowProgress, sharedPreference.getString("Ad", "default value"), Snackbar.LENGTH_SHORT).show()
        Toast.makeText(this, apiManager.getAd(), Toast.LENGTH_LONG).show()
    }
}
