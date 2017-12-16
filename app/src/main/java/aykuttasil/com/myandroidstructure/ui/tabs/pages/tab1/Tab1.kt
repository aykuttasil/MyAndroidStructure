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
class Tab1 : BaseFragment<Tab1Contract.Tab1View, Tab1Presenter>(), Tab1Contract.Tab1View {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tab1, container, false)
    }

    override fun createPresenter(): Tab1Presenter {
        return Tab1Presenter()
    }
}