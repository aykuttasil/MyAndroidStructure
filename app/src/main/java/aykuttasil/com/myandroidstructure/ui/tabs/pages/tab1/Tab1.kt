package aykuttasil.com.myandroidstructure.ui.tabs.pages.tab1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import aykuttasil.com.myandroidstructure.ui.base.BaseFragment
import org.jetbrains.anko.button
import org.jetbrains.anko.editText
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.support.v4.UI
import org.jetbrains.anko.support.v4.toast
import org.jetbrains.anko.verticalLayout

/**
 * Created by aykutasil on 14.12.2017.
 */
class Tab1 : BaseFragment<Tab1Contract.Tab1View, Tab1Presenter>(), Tab1Contract.Tab1View {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return UI {
            verticalLayout {
                val name = editText()
                button("Say Hello") {
                    onClick { toast("Hello, ${name.text}!") }
                }
            }
        }.view
        //return inflater.inflate(R.layout.fragment_tab1, container, false)
    }

    override fun createPresenter(): Tab1Presenter {
        return Tab1Presenter()
    }
}