package com.yeonholee.widget

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

// 불러올 Activiy을 import하기
import com.yeonholee.widget.TextInputLayoutActivity
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Intent에 원하는 Activity 입력하기
        val intent = Intent(this, TextInputLayoutActivity::class.java)
        startActivity(intent)
    }
}








