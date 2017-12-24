package aykuttasil.com.myandroidstructure.ui.detail

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import aykuttasil.com.myandroidstructure.R
import aykuttasil.com.myandroidstructure.ui.base.BaseActivity
import aykuttasil.com.myandroidstructure.ui.tabs.TabsActivity
import kotlinx.android.synthetic.main.activity_detail.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.selector
import org.jetbrains.anko.toast
import javax.inject.Inject

/**
 * Created by aykutasil on 14.12.2017.
 */
class DetailActivity : BaseActivity<DetailContract.DetailView, DetailPresenter>(), DetailContract.DetailView {

    @Inject
    lateinit var sharedPreference: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        btnShowSomething.onClick {
            presenter.showSomething()

            val countries = listOf("Russia", "USA", "Japan", "Australia")
            selector("Where are you from?", countries, { _, i ->
                toast("So you're living in ${countries[i]}, right?")
            })
        }

        btnGoTabs1.onClick {
            val intent = Intent(this@DetailActivity, TabsActivity::class.java)
            startActivity(intent)
        }

    }

    override fun createPresenter(): DetailPresenter {
        return DetailPresenter()
    }

    override fun showToast(msg: String?) {
        longToast(msg ?: "msg is null").show()
    }
}