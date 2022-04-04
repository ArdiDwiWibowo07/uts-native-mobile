package com.ardidwiwibowo.hitungbangundatar

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.ardidwiwibowo.hitungbangundatar.databinding.ActivityPersegipanjangBinding

class PersegiPanjangActivity : AppCompatActivity() {

    //membuat binding untuk layout ActivityPersegipanjangBinding
    lateinit var binding: ActivityPersegipanjangBinding
    //lifecycle on create dimulai atau aktivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //menampilkan layout  ActivityPersegipanjangBinding
        binding = ActivityPersegipanjangBinding.inflate(layoutInflater)
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
        //mengambil data text dari component dengan id stringInPanjang dan  stringInLebar yang berbentuk string
        val stringInPanjang = binding.etPanjang.text.toString()
        val stringInLebar = binding.etLebar.text.toString()
        //jika salah satu dari variabel kosong maka tampilkan pop up
        if (stringInPanjang.isEmpty() || stringInLebar.isEmpty()) {
            Toast.makeText(this, "Mohon masukkan inputan yag ada", Toast.LENGTH_SHORT).show()
            return
        }
        //menyimpan variabel tadi menjadi tipe double
        val panjang = stringInPanjang.toDouble()
        val lebar = stringInLebar.toDouble()

        //Masukan rumus rumusnya
        var luas = panjang * lebar
        var keliling = 2 * (panjang+lebar)

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
        binding.etPanjang.setText(getString(R.string.panjang,""))
        binding.etLebar.setText(getString(R.string.lebar,""))
    }
}
