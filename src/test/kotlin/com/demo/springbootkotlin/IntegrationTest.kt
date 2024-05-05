package com.demo.springbootkotlin


import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IntegrationTest(@Autowired val restTemplate: TestRestTemplate){
    @BeforeAll
    fun setup(){
        println(">> startup")
    }

    @Test
    fun `Testing for Book Endpoint`(){
        val entity = restTemplate.getForEntity<String>("/book")
        assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
    }
}