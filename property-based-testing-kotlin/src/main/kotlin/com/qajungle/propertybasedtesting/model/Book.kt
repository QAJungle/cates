package com.qajungle.propertybasedtesting.model

data class Book(
  val isbn: String,
  val name: String,
  val quantity: Int)

fun Book.toResponse() = BookResponse(
  info = "$isbn::$name::$quantity"
)