package com.clearsky77.pizzaorderappreview.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
                        // (보냈던 REQ_FOR_NICKNAME, OK 누른 것 맞는가, 받아오는 인텐트)
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == REQ_FOR_NICKNAME){
            if(resultCode == Activity.RESULT_OK){
                val newNick = data!!.getStringExtra("nickname") // null일리 업기때문에 !!로 처리
                nicknameTxt.text = newNick
            }
        }
    }
}