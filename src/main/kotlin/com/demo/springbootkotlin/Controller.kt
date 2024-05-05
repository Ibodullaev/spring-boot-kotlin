package com.demo.springbootkotlin

import org.springframework.web.bind.annotation.*

@RestController
class BookController(val repo: BookRepository){
    @PostMapping("/book")
    fun addBooks(@RequestBody book: Book){
        repo.save(book)
    }
    @GetMapping("/book")
    fun getAllBooks() : List<Book> = repo.findAll().toList()
    @GetMapping("/book/{title}")
    fun getByBookTitle(@PathVariable("title") title : String) = repo.findByTitle(title)
}