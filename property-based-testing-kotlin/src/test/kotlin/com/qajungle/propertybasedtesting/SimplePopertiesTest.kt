package com.qajungle.propertybasedtesting

import io.kotlintest.specs.StringSpec
import io.kotlintest.properties.forAll

class SimplePopertiesTest : StringSpec ({

  "reversing a list twice should return the list" {
    forAll{ list: List<Int> ->
      list.reversed().reversed().toList() == list
    }
  }

  "a concatenated string size is equals to each length sum" {
    forAll(2300) { a: String, b: String ->
      (a + b).length == a.length + b.length
    }
  }

  "concat of a two strings must start by the first string" {
    forAll { a: String, b: String ->
      (a + b).startsWith(a)
    }
  }

  "a concatenated two string length must be greater of one of those strings" {
    forAll { a: String, b: String ->
      (a + b).length > a.length && (a + b).length > b.length
    }
  }

  "a string is a substring of a concatenated strings" {
    forAll { a: String, b: String, c: String ->
      (a + b + c).substring(a.length, a.length + b.length) == b
    }
  }

})