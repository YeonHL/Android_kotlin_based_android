package com.yeonholee.widget

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.yeonholee.widget.databinding.TextViewBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: TextViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TextViewBinding.inflate(layoutInflater) // 뷰 바인딩 인스턴스 생성
        val view = binding.root // 뷰 바인딩의 루트 뷰에 접근
        setContentView(view) // 액티비티에 뷰 바인딩 루트 뷰 설정
        
        binding.text1.text = "안녕하세요"
        binding.text1.setBackgroundColor(Color.argb(100,100,100,100))
        binding.text1.setTextColor(Color.BLUE)
        binding.text1.append(" 감사합니다.")
    }
}