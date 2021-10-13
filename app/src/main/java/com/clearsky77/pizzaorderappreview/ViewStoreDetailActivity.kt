package com.clearsky77.pizzaorderappreview

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.clearsky77.pizzaorderappreview.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*
import android.widget.Toast

import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.normal.TedPermission


class ViewStoreDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)

        val storeData = intent.getSerializableExtra("store") as StoreData // serializable된 것을 캐스팅

        Glide.with(this).load(storeData.logoURL).into(logoImg)
        storeNameTxt.text = storeData.name
        phoneNum.text = storeData.phoneNum


        callBtn.setOnClickListener {
            //val permissionlistener: PermissionListener = object : PermissionListener {
            val pl = object : PermissionListener{
                override fun onPermissionGranted() {
                    val myUri = Uri.parse("tel:${storeData.phoneNum}")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)
                }
                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                    Toast.makeText(this@ViewStoreDetailActivity, "통화 권한이 거절되었습니다.", Toast.LENGTH_SHORT).show()
                }
            }
            TedPermission.create()
                .setPermissionListener(pl) // pl에 적힌대로 해주세요
                .setPermissions(Manifest.permission.CALL_PHONE) // 매니페스트에 콜 권한이 있어요.
                .check() // 이걸 물어봐주세요

        }

    }
}