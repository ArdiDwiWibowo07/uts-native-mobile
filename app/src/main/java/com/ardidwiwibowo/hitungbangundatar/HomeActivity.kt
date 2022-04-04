package com.ardidwiwibowo.hitungbangundatar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.ardidwiwibowo.hitungbangundatar.databinding.ActivityHomeBinding


class HomeActivity: AppCompatActivity() {
    //membuat binding untuk layout ActivityHomeBinding
    lateinit var binding: ActivityHomeBinding

    //lifecycle on create dimulai atau aktivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //menampilkan layout ActivityMainbinding
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //ketika tombol dengan id btnProfile diklik
        binding.btnProfile.setOnClickListener {
            //membuat intent yang berisi menuju clas ProfileActivity
            val intent = Intent(this, ProfileActivity::class.java)
            //activity clas  ProfileActivity dimulai
            startActivity(intent)
        }

        //ketika component dengan id btnPersegi diklik
        binding.btnPersegi.setOnClickListener {
            //membuat intent yang berisi menuju clas PersegiActivity
            val intent = Intent(this, PersegiActivity::class.java)
            //activity clas PersegiActivity dimulai
            startActivity(intent)
        }

        //ketika component dengan id btnPerpan diklik
        binding.btnPerpan.setOnClickListener {
            //membuat intent yang berisi menuju clas PersegiPanjangActivity
            val intent = Intent(this, PersegiPanjangActivity::class.java)
            //activity clas PersegiPanjangActivity dimulai
            startActivity(intent)
        }

        //ketika component dengan id btnLingkaran diklik
        binding.btnLingkaran.setOnClickListener{
            //membuat intent yang berisi menuju clas LingkaranActivity
            val intent = Intent(this, LingkaranActivity::class.java)
            //activity clas LingkaranActivity dimulai
            startActivity(intent)
        }

        //ketika component dengan id btnSegitiga diklik
        binding.btnSegitiga.setOnClickListener {
            //membuat intent yang berisi menuju clas SegitigaActivity
            val intent = Intent(this, SegitigaActivity::class.java)
            //activity clas SegitigaActivity dimulai
            startActivity(intent)
        }
    }
}
