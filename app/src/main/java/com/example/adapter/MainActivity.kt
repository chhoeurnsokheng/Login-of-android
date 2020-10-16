package com.example.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                val arrayList = listOf<Inforlist>(
                        Inforlist("sokheng", "chhoeurnsokheng",R.drawable.images4),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images1),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images2),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images3),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images4),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images5),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images6),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images1),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images2),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images3),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images4),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images5),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images6),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images1),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images2),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images3),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images4),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images5),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images6),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images1),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images2),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images3),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images4),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images5),
                        Inforlist("chhoeurn", "chhoeurn@gmail.com", R.drawable.images6) )
                recyclerview.layoutManager =LinearLayoutManager(this)
                recyclerview.adapter=AdapterRecycler(arrayList)
                recyclerview.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
        }
        class Inforlist(val name: String, val emaillist:String ,val imagelist: Int)
}
