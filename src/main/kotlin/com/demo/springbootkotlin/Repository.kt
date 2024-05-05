package com.demo.springbootkotlin

import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<Book, Long>{
    fun findByTitle(title : String ) : Book
}