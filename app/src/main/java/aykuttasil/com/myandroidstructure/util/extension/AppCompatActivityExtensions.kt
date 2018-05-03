package aykuttasil.com.myandroidstructure.util.extension


import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity


fun AppCompatActivity.replaceFragment(layoutId: Int, fragment: Fragment) {
    supportFragmentManager.transaction { replace(layoutId, fragment) }
}

fun AppCompatActivity.addFragment(layoutId: Int, fragment: Fragment) {
    supportFragmentManager.transaction { add(layoutId, fragment) }
}