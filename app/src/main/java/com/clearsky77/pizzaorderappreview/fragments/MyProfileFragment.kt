package com.clearsky77.pizzaorderappreview.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.clearsky77.pizzaorderappreview.EditNicknameActivity
import com.clearsky77.pizzaorderappreview.R
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MyProfileFragment : Fragment() {

    val REQ_FOR_NICKNAME = 1010 // 변수명이 전부 대문자면 메모를 하는 변수라는 암묵적 뜻

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        editNicknameBtn.setOnClickListener {
            val myIntent = Intent(requireContext(), EditNicknameActivity::class.java) //여기가 화면이 아니기 때문에 requireContext() 한다
            startActivityForResult(myIntent, REQ_FOR_NICKNAME) // 닉네임 받으러간다는 숫자값 넣어야함.
        }

    }
}