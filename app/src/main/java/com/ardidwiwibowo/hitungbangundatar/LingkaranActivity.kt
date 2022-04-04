package com.ardidwiwibowo.hitungbangundatar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ardidwiwibowo.hitungbangundatar.databinding.ActivityLingkaranBinding
import com.ardidwiwibowo.hitungbangundatar.databinding.ActivityMainBinding
import kotlin.math.PI


class LingkaranActivity : AppCompatActivity() {
    //membuat binding untuk layout ActivityLingkaranBinding
    lateinit var binding: ActivityLingkaranBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        //lifecycle on create dimulai atau aktivity
        super.onCreate(savedInstanceState)
        //menampilkan layoutActivityLingkaranBinding
        binding = ActivityLingkaranBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //ketika tombol dengan btnBack diklik
        binding.btnBack.setOnClickListener {
            //membuat intent yang berisi menuju clas  HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            //activity clas HomeActivity dimulai
            startActivity(intent)
            //activity ini diakirki atau dihapus dari backstage
            finish()
        }
        //ketika tombol dengan id btnHitung diklik
        binding.btnHitung.setOnClickListener {
            //jalankan fungsi  hitung()
            hitung()
        }
        binding.btnReset.setOnClickListener {
            //jalankan fungsi  reset()
            reset()
        }

    }
    fun hitung() {
        //mengambil data text dari component dengan id etRadiusyang berbentuk string
        val stringInRadius = binding.etRadius.text.toString()
        //jika salah satu dari variabel kosong maka tampilkan pop up
        if (stringInRadius.isEmpty()) {
            Toast.makeText(this, "Mohon masukkan inputan yag ada", Toast.LENGTH_SHORT).show()
            return
        }
        //menyimpan variabel tadi menjadi tipe double
        val radius = stringInRadius.toDouble()

        //Masukan rumus rumusnya
        var luas = PI * radius * radius
        var keliling = 2 * PI * radius

        //hasil rumus dijadikan string
        val resLuas = luas.toString()
        val resKeliling = keliling.toString()

        //tampilkan hasil rumus pada component id etLuas dan etKeliling
        binding.etLuas.setText(getString(R.string.luas,resLuas))
        binding.etKeliling.setText(getString(R.string.keliling,resKeliling))
    }

    fun reset(){
        //membuat input menjadi kosong dan luas dan keliling menjadi 0
        binding.etLuas.setText(getString(R.string.luas,"0"))
        binding.etKeliling.setText(getString(R.string.keliling,"0"))
        binding.etRadius.setText(getString(R.string.panjang,""))

    }

    }

