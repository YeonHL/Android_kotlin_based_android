package com.yeonholee.widget

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.yeonholee.widget.databinding.ButtonBinding

class ButtonActivity : ComponentActivity() {
    private lateinit var binding: ButtonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ButtonBinding.inflate(layoutInflater) // 뷰 바인딩 인스턴스 생성
        val view = binding.root // 뷰 바인딩의 루트 뷰에 접근
        setContentView(view) // 액티비티에 뷰 바인딩 루트 뷰 설정

        binding.apply {
            text3.text = "binding apply"
            button1.setOnClickListener {
                text3.text = "첫 번째 버튼을 눌렀습니다."
            }

            imageButton1.setOnClickListener {
                text3.text = "두 번째 버튼을 눌렀습니다."
            }

            button2.setOnClickListener {
                text3.text = "세 번째 버튼을 눌렀습니다."
            }

            button3.setOnClickListener {
                text3.text = "네 번째 버튼을 눌렀습니다."
            }
        }
    }
}