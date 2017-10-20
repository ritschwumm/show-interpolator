package showInterpolator

import org.specs2.mutable._

class Test extends Specification {
    println("spec!")
    "show interpolator" should {
        "do an empty string" in {
            show"""""" mustEqual ""
        }
        "do a single string" in {
            show"""a""" mustEqual "a"
        }
        "do a single value" in {
            val a = "1"
            show"""$a""" mustEqual "1"
        }
        "do a string and a value" in {
            val a = "1"
            show"""${a}test""" mustEqual "1test"
        }
        "do a value and a string" in {
            val a = "1"
            show"""test${a}""" mustEqual "test1"
        }
        "work with multiple types" in {
            val a = "1"
            val b = 2
            val c = true
            show"""aaa${a}bbb${b}ccc${c}""" mustEqual "aaa1bbb2ccctrue"
        }
    }
}
