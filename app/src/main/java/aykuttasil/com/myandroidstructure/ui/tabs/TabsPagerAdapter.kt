package aykuttasil.com.myandroidstructure.ui.tabs

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import aykuttasil.com.myandroidstructure.ui.tabs.pages.tab1.Tab1
import aykuttasil.com.myandroidstructure.ui.tabs.pages.tab1.Tab2

/**
 * Created by aykutasil on 15.12.2017.
 */
class TabsPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                Tab1()
            }
            1 -> {
                Tab2()
            }
            else -> {
                Tab1()
            }
        }
    }

    override fun getCount(): Int {
        return 2
    }
}