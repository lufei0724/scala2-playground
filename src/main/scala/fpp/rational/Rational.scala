package fpp.rational

case class Rational(x: Int, y: Int) {
  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  val numer = x / gcd(x.abs, y)
  val denom = y / gcd(x.abs, y)

  def add(r: Rational): Rational = {
    Rational(numer * r.denom + denom * r.numer, denom * r.denom)
  }

  def mul(r: Rational): Rational = {
    Rational(numer * r.numer, denom * r.denom)
  }

  def neg: Rational = Rational(-numer, denom)

  def sub(r: Rational): Rational = add(r.neg)

  def less(a: Rational): Boolean = numer * a.denom < denom * a.numer

  def max(a: Rational): Rational = if (this.less(a)) a else this

  override def toString = s"$numer/$denom"
}