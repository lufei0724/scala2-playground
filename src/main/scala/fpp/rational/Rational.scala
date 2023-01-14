package fpp.rational

case class Rational(numer: Int, denom: Int) {
  def add(r: Rational): Rational = {
    Rational(numer * r.denom + denom * r.numer, denom * r.denom)
  }

  def mul(r: Rational): Rational = {
    Rational(numer * r.numer, denom * r.denom)
  }

  def neg: Rational = Rational(-numer, denom)

  def sub(r: Rational): Rational = add(r.neg)

  override def toString = s"$numer/$denom"
}