package com.clearsky77.pizzaorderappreview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.clearsky77.pizzaorderappreview.R
import com.clearsky77.pizzaorderappreview.datas.StoreData

class PizzaStoreAdapter(
    val mContext : Context, // 어느 화면이 쓰는지 알려달라
    val resId : Int, // R.으로 찾는 것의 인트로된 아이디
    val mList : ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext) // inflate 해주는 도구

    // 우리가 원하는 모양으로 보여주기 위해 getView를 오버라이딩
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView // convertView 그대로 쓰기 어려워서 일단 변수로 담아준다.
        if(tempRow == null){
            tempRow = mInflater.inflate(R.layout.pizza_store_list_item, null) // 해당 xml을 인스턴스로 만들어준다.
        }
        val row = tempRow!! // !!는 널이 아니라는 뜻
        return row
    }
}