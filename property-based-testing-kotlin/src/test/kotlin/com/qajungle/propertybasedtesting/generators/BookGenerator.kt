package com.qajungle.propertybasedtesting.generators

import com.qajungle.propertybasedtesting.model.Book
import io.kotlintest.properties.Gen

class BookGenerator : Gen<Book> {
  override fun constants() = emptyList<Book>()
  override fun random() = generateSequence {
    Book(
      Gen.string().random().first(),
      Gen.string().random().first(),
      Gen.int().random().first()
    )
  }
}