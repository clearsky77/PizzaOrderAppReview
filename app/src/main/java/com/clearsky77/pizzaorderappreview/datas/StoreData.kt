package com.clearsky77.pizzaorderappreview.datas

import java.io.Serializable

class StoreData(
    val name : String,
    val phoneNum : String,
    val logoURL : String
) : Serializable // intent에서 putExtra한 것을 getExtra가 가능하도도록
                // (지원 가능한 자료형이 따로 있다) 지원되는 자료형처럼 보이게 하기 -> Serializable
{
}