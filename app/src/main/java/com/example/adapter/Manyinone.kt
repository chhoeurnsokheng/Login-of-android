package com.example.adapter


import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class Manyinone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.many_in_one)
        val imageVie = intent.extras?.getInt("image")
        val username = intent.extras?.getString("username")
        val emailview = intent.extras?.getString("email")
        val imageView1 = findViewById<ImageView>(R.id.imageView)
        val emailText = findViewById<TextView>(R.id.emailview)
        val userText1 = findViewById<TextView>(R.id.usernameview)
        userText1.setText(username)
        emailText.setText(emailview)
        if (imageVie != null) {
            imageView1.setImageResource(imageVie)
        }

    }
}
