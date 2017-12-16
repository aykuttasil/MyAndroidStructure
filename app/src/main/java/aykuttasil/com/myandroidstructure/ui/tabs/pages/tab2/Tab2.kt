package aykuttasil.com.myandroidstructure.ui.tabs.pages.tab1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import aykuttasil.com.myandroidstructure.R
import aykuttasil.com.myandroidstructure.ui.base.BaseFragment

/**
 * Created by aykutasil on 14.12.2017.
 */
class Tab2 : BaseFragment<Tab2Contract.Tab2View, Tab2Presenter>(), Tab2Contract.Tab2View {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tab2, container, false)

    }

    override fun createPresenter(): Tab2Presenter {
        return Tab2Presenter()
    }
}