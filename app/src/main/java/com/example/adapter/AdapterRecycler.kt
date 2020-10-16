package com.example.adapter

import android.content.Intent
import android.view.InflateException
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class AdapterRecycler( val exampleList: List<MainActivity.Inforlist>) :
    RecyclerView.Adapter<AdapterRecycler.ViewHolder>() {
    class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val itemimage = itemview.findViewById<ImageView>(R.id.image_item)
        val itemusername = itemview.findViewById<TextView>(R.id.nameTextView)
        val itememail = itemview.findViewById<TextView>(R.id.emailTextView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.datails, parent, false)
        return ViewHolder(v)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = exampleList[position]
        holder.itememail.setText(item.emaillist)
        holder.itemimage.setImageResource(item.imagelist)
        holder.itemusername.setText(item.name)
        holder.itemView.setOnClickListener {
            val intent= Intent(it.context,Manyinone::class.java)
            intent.putExtra("image",item.imagelist)
            intent.putExtra("username",item.name)
            intent.putExtra("email",item.emaillist)
            it.context.startActivity(intent)
        }
    }
    override fun getItemCount(): Int {
        return exampleList.size
    }

}
//  class Inforlist(val name: String, val emailval: String, val imagelist: Int)
