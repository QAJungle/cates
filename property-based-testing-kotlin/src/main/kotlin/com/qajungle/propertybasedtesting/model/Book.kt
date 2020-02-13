package com.qajungle.propertybasedtesting.model

data class Book(val isbn: String, val name: String)

fun Book.toResponse() = BookResponse(
  info = "$isbn::$name"
)