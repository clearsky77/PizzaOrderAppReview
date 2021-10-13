package com.clearsky77.pizzaorderappreview.datas

import java.io.Serializable

class StoreData(
    val name : String,
    val phoneNum : String,
    val logoURL : String
) : Serializable //getExtra가 가능한 자료형처럼 보이게 하기 -> Serializable
{
}