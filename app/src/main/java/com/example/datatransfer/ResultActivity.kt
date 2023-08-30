package com.example.datatransfer

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import com.example.datatransfer.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@ResultActivity, R.layout.activity_result)

        binding.button3.setOnClickListener {
            val intent = Intent()
            intent.putExtra("data", "hello")
            setResult(Activity.RESULT_OK, intent)
        }
    }
}