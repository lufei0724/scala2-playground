package fpp.rational

class RationalSuite extends munit.FunSuite {
  test("Should return 1/2 given Rational(1, 2)") {
    val x = Rational(1, 2)
    val expected = "1/2"
    assertEquals(x.toString, expected)
  }

  test("Should return sum when adding a Rational") {
    val x = Rational(1, 2)
    val y = Rational(1, 3)
    val expected = "5/6"
    assertEquals(x.add(y).toString, expected)
  }

  test("Should return product when multiplying a Rational") {
    val x = Rational(1, 2)
    val y = Rational(1, 3)
    val expected = "1/6"
    assertEquals(x.mul(y).toString, expected)
  }

  test("Should return negative Rational when neg method called") {
    val x = Rational(1, 2)
    val expected = "-1/2"
    assertEquals(x.neg.toString, expected)
  }

  test("Should return sum when adding a negative Rational") {
    val x = Rational(1, 2)
    val y = Rational(1, 3).neg
    val expected = "1/6"
    assertEquals(x.add(y).toString, expected)
  }

  test("Should return product when multiplying a negative Rational") {
    val x = Rational(1, 2)
    val y = Rational(1, 3).neg
    val expected = "-1/6"
    assertEquals(x.mul(y).toString, expected)
  }

  test("Should return difference when subtracting a Rational") {
    val x = Rational(1, 2)
    val y = Rational(1, 3)
    val expected = "1/6"
    assertEquals(x.sub(y).toString, expected)
  }

  test("Should return -79/42 when R(1, 3) - R(5, 7) - R(3, 2)") {
    val x = Rational(1, 3)
    val y = Rational(5, 7)
    val z = Rational(3, 2)
    assertEquals(x.sub(y).sub(z).toString, expected = "-79/42")
  }

  test("Should return simplified rational number") {
    val x = Rational(2, 6)
    val y = Rational(20, 40)
    val z = Rational(50, 20)
    assertEquals(x.toString, "1/3")
    assertEquals(y.toString, "1/2")
    assertEquals(z.toString, "5/2")
  }

  test("Should be able to tell if a rational number is less than another") {
    val x = Rational(2, 6)
    val y = Rational(20, 40)
    assert(x.less(y))
    assert(!y.less(x))
  }

  test("Should return the greater one when compare with another rational number") {
    val x = Rational(2, 6)
    val y = Rational(20, 40)
    assertEquals(x.max(y), y)
    assertEquals(y.max(x), y)
  }
}
