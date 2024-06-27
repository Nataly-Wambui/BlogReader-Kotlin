package com.akirachix.blogreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class BlogsAdapter (var blogList: List<Blog>): RecyclerView.Adapter<BlogsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogsViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.writers_blog, parent, false)
        return BlogsViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: BlogsViewHolder, position: Int) {
        val blog = blogList[position]
        holder.tvAuthor.text = blog.author
        holder.tvTitle.text = blog.title
        holder.tvPublication.text = blog.publication.toString()
        holder.tvPreview.text = blog.preview
        holder.tvSeeMore.text = blog.seeMore

    }

    override fun getItemCount(): Int {
        return blogList.size
    }
}

class BlogsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvPublication= itemView.findViewById<TextView>(R.id.tvPublication)
    var tvPreview= itemView.findViewById<TextView>(R.id.tvPreview)
    var tvSeeMore = itemView.findViewById<TextView>(R.id.tvSeeMore)
}