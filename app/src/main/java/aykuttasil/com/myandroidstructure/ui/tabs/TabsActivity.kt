package aykuttasil.com.myandroidstructure.ui.tabs

import android.content.SharedPreferences
import android.os.Bundle
import android.support.v4.app.Fragment
import aykuttasil.com.myandroidstructure.R
import aykuttasil.com.myandroidstructure.ui.base.BaseActivity
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_tabs.*
import javax.inject.Inject


/**
 * Created by aykutasil on 14.12.2017.
 */
class TabsActivity : BaseActivity<TabsContract.TabsView, TabsPresenter>(), TabsContract.TabsPresenter, HasSupportFragmentInjector {

    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var tabsPagerAdapter: TabsPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabs)
        setPages()
    }

    private fun setPages() {
        viewpager.adapter = tabsPagerAdapter
    }

    override fun createPresenter(): TabsPresenter {
        return TabsPresenter()
    }


    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return fragmentDispatchingAndroidInjector
    }


}