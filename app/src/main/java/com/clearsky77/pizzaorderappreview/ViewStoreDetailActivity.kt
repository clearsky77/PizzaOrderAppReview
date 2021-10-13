package com.clearsky77.pizzaorderappreview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.clearsky77.pizzaorderappreview.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)

        val storeData = intent.getSerializableExtra("store") as StoreData // serializable된 것을 캐스팅

        Glide.with(this).load(storeData.logoURL).into(logoImg)
        storeNameTxt.text = storeData.name
        phoneNum.text = storeData.phoneNum
    }
}