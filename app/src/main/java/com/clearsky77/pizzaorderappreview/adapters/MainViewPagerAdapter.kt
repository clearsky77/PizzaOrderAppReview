package com.clearsky77.pizzaorderappreview.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.clearsky77.pizzaorderappreview.fragments.MyProfileFragment
import com.clearsky77.pizzaorderappreview.fragments.PizzaStoreListFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> PizzaStoreListFragment()
            else -> MyProfileFragment()
        }
    }
}