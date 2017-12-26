package aykuttasil.com.myandroidstructure.ui.tabs

import android.os.Bundle
import aykuttasil.com.myandroidstructure.R
import aykuttasil.com.myandroidstructure.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_tabs.*
import javax.inject.Inject


/**
 * Created by aykutasil on 14.12.2017.
 */
class TabsActivity : BaseActivity<TabsContract.TabsView, TabsPresenter>(), TabsContract.TabsPresenter {

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

}