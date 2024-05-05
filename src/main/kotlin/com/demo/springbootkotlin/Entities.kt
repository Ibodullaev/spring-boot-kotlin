package com.demo.springbootkotlin

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Book(
    @Id @GeneratedValue var id: Long,
    var isbn: String,
    var title: String
)