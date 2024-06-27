package com.akirachix.blogreader

data class Blog(
    var profile: String,
    var author: String,
    var title: String,
    var publication: Int,
    var preview: String,
    var blogImage: String,
    var seeMore: String
)
