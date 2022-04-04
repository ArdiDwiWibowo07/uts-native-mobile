package com.ardidwiwibowo.hitungbangundatar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ardidwiwibowo.hitungbangundatar.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    //membuat binding untuk layout ActivityMainbinding
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        //lifecycle on create dimulai atau aktivity
        super.onCreate(savedInstanceState)

        //menampilkan layout ActivityMainbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //ketika tombol dengan id btnMulai diklik
        binding.btnMulai.setOnClickListener {
            //membuat intent yang berisi menuju clas HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            //activity clas HomeActivity dimulai
            startActivity(intent)
            //activity ini diakirki atau dihapus dari backstage
            finish()
        }
    }

}