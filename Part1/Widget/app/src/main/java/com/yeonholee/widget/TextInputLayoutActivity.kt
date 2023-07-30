package com.yeonholee.widget

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.yeonholee.widget.databinding.TextInputLayoutBinding

class TextInputLayoutActivity : ComponentActivity() {
    private lateinit var binding: TextInputLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TextInputLayoutBinding.inflate(layoutInflater) // 뷰 바인딩 인스턴스 생성
        val view = binding.root // 뷰 바인딩의 루트 뷰에 접근
        setContentView(view) // 액티비티에 뷰 바인딩 루트 뷰 설정

        binding.apply {

        }
    }
}

//class MainActivity {
//
//}