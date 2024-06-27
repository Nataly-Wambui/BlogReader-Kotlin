package com.akirachix.blogreader

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.blogreader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBlogs.layoutManager = LinearLayoutManager(this)
        displayBlogs()

    }

    fun displayBlogs(){
        val blog1 = Blog(" ", "Bored Panda", "African Woman", 2023, "You are an Africana Woman because you desire a Life you absolutely Love. Therefore, you are intentional about pursuing abundant wealth in", " ", "See more...")
        val blog2 = Blog(" ", "Joanna Penn", "The Creative Penn", 2013, "You are an Africana Woman because you desire a Life you absolutely Love. Therefore, you are intentional about pursuing abundant wealth in", " ", "See more...")
        val blog3 = Blog(" ", "Jane Friedman ", "The Write Life", 2020, "You are an Africana Woman because you desire a Life you absolutely Love. Therefore, you are intentional about pursuing abundant wealth in", " ", "See more...")
        val blog4 = Blog(" ", "Lee Goldberg", "New York Times", 2016, "You are an Africana Woman because you desire a Life you absolutely Love. Therefore, you are intentional about pursuing abundant wealth in", " ", "See more...")
        val blog5 = Blog(" ", "K.M.Weiland", "Helping Writers Become Authors", 2018, "You are an Africana Woman because you desire a Life you absolutely Love. Therefore, you are intentional about pursuing abundant wealth in", " ", "See more...")
        val blog6 = Blog(" ", "David Allen", "Between the Lines", 2011, "You are an Africana Woman because you desire a Life you absolutely Love. Therefore, you are intentional about pursuing abundant wealth in", " ", "See more...")
        val blog7 = Blog(" ", "M.J. Rose", "Buzz, Balls and Hype", 2023, "You are an Africana Woman because you desire a Life you absolutely Love. Therefore, you are intentional about pursuing abundant wealth in", " ", "See more...")
        val blog8 = Blog(" ", "Debbie Ridpath", "Blatherings", 2008, "You are an Africana Woman because you desire a Life you absolutely Love. Therefore, you are intentional about pursuing abundant wealth in", " ", "See more...")
        val blog9 = Blog(" ", "PJ Parrish", "Cabbages and Kings", 2021, "You are an Africana Woman because you desire a Life you absolutely Love. Therefore, you are intentional about pursuing abundant wealth in", " ", "See more...")
        val blog10 = Blog(" ", "Bruce Sterling", "Beyond the Beyond", 2018, "You are an Africana Woman because you desire a Life you absolutely Love. Therefore, you are intentional about pursuing abundant wealth in", " ", "See more...")
        val blogs = listOf(blog1, blog2, blog3, blog4, blog5, blog6, blog7, blog8, blog9, blog10)

        val blogsAdapter = BlogsAdapter(blogs)
        binding.rvBlogs.adapter = blogsAdapter
    }
}