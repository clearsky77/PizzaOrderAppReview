package com.clearsky77.pizzaorderappreview.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.clearsky77.pizzaorderappreview.datas.StoreData

class PizzaStoreAdapter(
    val mContext : Context, // 어느 화면이 쓰는지 알려달라
    val resId : Int, // R.으로 찾는 것의 인트로된 아이디
    val mList : ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext, resId, mList) {
}