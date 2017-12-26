package aykuttasil.com.myandroidstructure.ui.detail

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import aykuttasil.com.myandroidstructure.App
import aykuttasil.com.myandroidstructure.R
import aykuttasil.com.myandroidstructure.data.local.entity.UserEntitiy
import aykuttasil.com.myandroidstructure.di.ViewModelFactory
import aykuttasil.com.myandroidstructure.ui.base.BaseActivity
import aykuttasil.com.myandroidstructure.ui.tabs.TabsActivity
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.coroutines.experimental.delay
import org.jetbrains.anko.longToast
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.selector
import org.jetbrains.anko.toast
import javax.inject.Inject

/**
 * Created by aykutasil on 14.12.2017.
 */
class DetailActivity : BaseActivity<DetailContract.DetailView, DetailPresenter>(), DetailContract.DetailView {

    /*
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    override fun supportFragmentInjector(): DispatchingAndroidInjector<Fragment> {
        return dispatchingAndroidInjector
    }
    */

    @Inject
    lateinit var detailPresenter: DetailPresenter

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    @Inject
    lateinit var app: App

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val detailViewModel = ViewModelProviders.of(this, viewModelFactory).get(DetailViewModel::class.java)

        /*
        detailViewModel.getUsers().observe(this@DetailActivity, Observer {
            it?.forEach {
                Log.i("aaa", "" + it.UserId)
                Log.i("aaa", "" + it.UserName)
            }
        })
        */

        detailViewModel.getUsers().observe(this@DetailActivity, Observer<List<UserEntitiy>> { resp ->
            resp?.let {
                println(it)
            }
        })

        btnShowSomething.onClick {
            presenter.showSomething()

            val countries = listOf("Russia", "USA", "Japan", "Australia")
            selector("Where are you from?", countries, { _, i ->
                toast("So you're living in ${countries[i]}, right?")
            })
        }

        btnGoTabs1.onClick {
            delay(2000)
            val intent = Intent(this@DetailActivity, TabsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun createPresenter(): DetailPresenter {
        return detailPresenter
    }

    override fun showToast(msg: String?) {
        longToast(msg ?: "msg is null").show()
    }

    override fun showMessage(msg: String?) {

    }

    override fun showErrorMessage(msg: String?) {

    }

    override fun showSnackBar(msg: String?) {

    }
}