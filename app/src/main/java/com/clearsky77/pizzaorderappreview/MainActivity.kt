package com.clearsky77.pizzaorderappreview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.clearsky77.pizzaorderappreview.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mainViewPagerAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mainViewPagerAdapter

        mainTabLayout.setupWithViewPager(mainViewPager) // 탭과 페이저를 연결한다.
    }
}