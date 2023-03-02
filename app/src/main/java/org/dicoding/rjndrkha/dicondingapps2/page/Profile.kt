package org.dicoding.rjndrkha.dicondingapps2.page

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import org.dicoding.rjndrkha.dicondingapps2.R
import java.net.URLEncoder

class Profile : AppCompatActivity(), View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        supportActionBar?.title = "About Me"

        val btnDialPhone:ImageButton = findViewById(R.id.action_share)
        btnDialPhone.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.action_share->{
                val phoneNumber = "6289631565880" // nomor WhatsApp tujuan
                val message = "Halo Saya Rajendra"
                val message2 = "Email : Rajendra.rakha29@gmail.com"// pesan yang ingin dikirim

                Toast.makeText(this, "$message", Toast.LENGTH_SHORT).show()
                Toast.makeText(this, "$message2", Toast.LENGTH_SHORT).show()

                val intent = Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse("https://wa.me/$phoneNumber/?text=${Uri.encode(message+"\n\n"+message2)}")
                }

                if (intent.resolveActivity(packageManager) != null) {
                    startActivity(intent)
                } else {
                    // jika tidak ada aplikasi WhatsApp yang terpasang, tampilkan pesan error
                    Toast.makeText(this, "Tidak ada aplikasi WhatsApp yang terpasang", Toast.LENGTH_SHORT).show()
                }
            }
        }
        }
    }
