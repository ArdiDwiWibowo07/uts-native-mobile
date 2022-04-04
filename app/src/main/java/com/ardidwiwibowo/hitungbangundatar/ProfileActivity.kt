package com.ardidwiwibowo.hitungbangundatar

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ardidwiwibowo.hitungbangundatar.databinding.ActivityHomeBinding
import com.ardidwiwibowo.hitungbangundatar.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity()  {

    //membuat binding untuk layout ActivityProfileBinding
    lateinit var binding : ActivityProfileBinding
    //lifecycle on create dimulai atau aktivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //menampilkan layout ActivityProfileBinding
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //ketika tombol dengan id btnBack diklik
        binding.btnBack.setOnClickListener {
            //membuat intent yang berisi menuju clas  HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            //activity clas HomeActivity dimulai
            startActivity(intent)
            //activity ini diakirki atau dihapus dari backstage
            finish()
        }

        binding.btnGithub.setOnClickListener {
            github()
        }
        binding.btnFacebook.setOnClickListener {
            facebook()
        }
        binding.btnIg.setOnClickListener {
            ig()
        }
        binding.btnWa.setOnClickListener {
            wa()
        }

    }

    //membuat intent untuk unutuk akases github saya
    fun github(){
        val github = "https://github.com/ArdiDwiWibowo07";
        val queryUrl: Uri = Uri.parse(github)
        val intent = Intent(Intent.ACTION_VIEW, queryUrl)
        startActivity(intent)
    }

    //membuat intent untuk unutuk akases facebook saya
    fun facebook(){
        val facebook = "https://web.facebook.com/ardi.dwiwibowo/"
        val queryUrl: Uri = Uri.parse(facebook)
        val intent = Intent(Intent.ACTION_VIEW, queryUrl)
        startActivity(intent)
    }

    //membuat intent untuk unutuk akases whatspa saya
    fun wa(){
        val wa = "https://wa.me/+6285640464137"
        val queryUrl: Uri = Uri.parse(wa)
        val intent = Intent(Intent.ACTION_VIEW, queryUrl)
        startActivity(intent)
    }

    //membuat intent untuk unutuk akases ig saya
    fun ig(){
        val ig = "https://www.instagram.com/ardidwiwibowo/"
        val queryUrl: Uri = Uri.parse(ig)
        val intent = Intent(Intent.ACTION_VIEW, queryUrl)
        startActivity(intent)
    }
}