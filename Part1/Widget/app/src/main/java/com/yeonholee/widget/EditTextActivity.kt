package com.yeonholee.widget

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.InputMethodManager
import androidx.activity.ComponentActivity
import com.yeonholee.widget.databinding.EditTextBinding

class EditTextActivity : ComponentActivity() {
    private lateinit var binding: EditTextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = EditTextBinding.inflate(layoutInflater) // 뷰 바인딩 인스턴스 생성
        val view = binding.root // 뷰 바인딩의 루트 뷰에 접근
        setContentView(view) // 액티비티에 뷰 바인딩 루트 뷰 설정

        binding.apply {
            button5.setOnClickListener {
                text4.text = editText1.text

                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(editText1.windowToken, 0)

                editText1.clearFocus()
            }

            editText1.addTextChangedListener(listener1)
            editText1.setOnEditorActionListener { v, actionId, event ->
                text4.text = "엔터 버튼을 눌렀습니다."
                text5.text = editText1.text
                false

            }
        }

    }

    val listener1 = object : TextWatcher {
        // 문장열이 변경되기 전
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            binding.text4.text = "before : $s"
        }
        // 문자열 변경 작업이 완료되었을 때
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            binding.text5.text = "chaged : $s"
        }
        // 변경된 문자열이 화면에 반영되었을 때
        override fun afterTextChanged(s: Editable?) {
            binding.text6.text = "after : $s"
        }
    }
}
