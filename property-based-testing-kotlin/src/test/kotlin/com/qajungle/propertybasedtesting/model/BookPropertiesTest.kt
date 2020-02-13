package com.qajungle.propertybasedtesting.model

import com.qajungle.propertybasedtesting.generators.BookGenerator
import io.kotlintest.properties.forAll
import io.kotlintest.specs.StringSpec

class BookPropertiesTest : StringSpec ({

  "book response info is a concatenation of book data" {
    forAll(3000, BookGenerator()) { book: Book ->
      book.toResponse().info == ("${book.isbn}::${book.name}")
    }
  }
})