package com.clearsky77.pizzaorderappreview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        okBtn.setOnClickListener {
            val inputNickname = nicknameEdt.text.toString() // 내 화면의 정보를
            val resultIntent = Intent() // 빈 인텐트에(돌아갈 인텐트이기 때문에 내용이 없다)
            resultIntent.putExtra("nickname",inputNickname) // 인텐트에 정보를 담아서
            setResult(RESULT_OK, resultIntent) // 리절트에 (정보 담은)인텐트를 담는다
            finish() // 이전 화면으로 돌아가기
        }
    }
}