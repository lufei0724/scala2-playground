package fpp.rational

class RationalSuite extends munit.FunSuite {
  test("Should return 1/2 given Rational(1, 2)") {
    val x = new Rational(1, 2)
    val expected = "1/2"
    assertEquals(x.toString, expected)
  }

  test("Should return sum when adding a Rational") {
    val x = new Rational(1, 2)
    val y = new Rational(1, 3)
    val expected = "5/6"
    assertEquals(x.add(y).toString, expected)
  }

  test("Should return product when multiplying a Rational") {
    val x = new Rational(1, 2)
    val y = new Rational(1, 3)
    val expected = "1/6"
    assertEquals(x.mul(y).toString, expected)
  }

  test("Should return negative Rational when neg method called") {
    val x = new Rational(1, 2)
    val expected = "-1/2"
    assertEquals(x.neg.toString, expected)
  }

  test("Should return sum when adding a negative Rational") {
    val x = new Rational(1, 2)
    val y = new Rational(1, 3).neg
    val expected = "1/6"
    assertEquals(x.add(y).toString, expected)
  }

  test("Should return product when multiplying a negative Rational") {
    val x = new Rational(1, 2)
    val y = new Rational(1, 3).neg
    val expected = "-1/6"
    assertEquals(x.mul(y).toString, expected)
  }

  test("Should return difference when subtracting a Rational") {
    val x = new Rational(1, 2)
    val y = new Rational(1, 3)
    val expected = "1/6"
    assertEquals(x.sub(y).toString, expected)
  }

  test("Should return -79/42 when R(1, 3) - R(5, 7) - R(3, 2)") {
    val x = new Rational(1, 3)
    val y = new Rational(5, 7)
    val z = new Rational(3, 2)
    assertEquals(x.sub(y).sub(z).toString, expected = "-79/42")
  }
}
