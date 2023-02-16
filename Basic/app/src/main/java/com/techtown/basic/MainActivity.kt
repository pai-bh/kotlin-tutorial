package com.techtown.basic

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.techtown.basic.databinding.ActivityMainBinding

// 실행 전 사전조건
// 1. `build.gradle`에서 viewBinding = true로 설정한다.
// 2. build.gradle바뀔때마다 Sync를 맞춰주기 위해 위에 코끼리버튼 클릭

class MainActivity : AppCompatActivity() {
    // 1. binding 객체 생성
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 2. binding 객체 생성 2 ???
        var binding : ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            Toast.makeText(applicationContext, "버튼이 눌렸어요", Toast.LENGTH_LONG).show()
        }
    }
}