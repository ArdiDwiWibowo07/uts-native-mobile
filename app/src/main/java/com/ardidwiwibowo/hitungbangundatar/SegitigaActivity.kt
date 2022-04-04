package com.ardidwiwibowo.hitungbangundatar

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ardidwiwibowo.hitungbangundatar.databinding.ActivitySegitigaBinding
import kotlin.math.sqrt

class SegitigaActivity : AppCompatActivity() {
    //membuat binding untuk layout ActivitySegitigaBinding
    lateinit var binding: ActivitySegitigaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        //lifecycle on create dimulai atau aktivity
        super.onCreate(savedInstanceState)
        //menampilkan layout  ActivitySegitigaBinding
        binding = ActivitySegitigaBinding.inflate(layoutInflater)
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

        //ketika tombol dengan id btnHitung diklik
        binding.btnHitung.setOnClickListener {
            //jalankan fungsi  hitung()
            hitung()
        }
        //ketika tombol dengan id btnReset diklik
        binding.btnReset.setOnClickListener {
            //jalankan fungsi  reset()
            reset()
        }

    }
    fun hitung() {
        //mengambil data text dari component dengan id etAlas yang berbentuk string
        val stringInAlas = binding.etAlas.text.toString()
        //mengambil data text dari component dengan id etTinggi yang berbentuk string
        val stringInTinggi = binding.etTinggi.text.toString()
        //jika salah satu dari variabel kosong maka tampilkan pop up
        if (stringInAlas.isEmpty() || stringInTinggi.isEmpty()) {
            Toast.makeText(this, "Mohon masukkan inputan yag ada", Toast.LENGTH_SHORT).show()
            return
        }
        //menyimpan variabel tadi menjadi tipe double
        val alas = stringInAlas.toDouble()
        val tinggi = stringInTinggi.toDouble()

        //Masukan rumus rumusnya
        val luas = 0.5 * alas * tinggi
        var setengahAlas = 0.5 * alas
        var kuadaratMiring = Math.pow(setengahAlas,2.0) + Math.pow(tinggi, 2.0)
        var sisimiring = sqrt(kuadaratMiring)
        var keliling = 2 * sisimiring + alas

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
        binding.etAlas.setText(getString(R.string.panjang,""))
        binding.etTinggi.setText("")

    }
}