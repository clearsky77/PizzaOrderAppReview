package com.clearsky77.pizzaorderappreview.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.clearsky77.pizzaorderappreview.datas.StoreData

class PizzaStoreAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<StoreData>

) : ArrayAdapter<StoreData>(mContext, resId, mList) {
}