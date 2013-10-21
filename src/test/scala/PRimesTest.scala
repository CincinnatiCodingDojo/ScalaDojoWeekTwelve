package dojoweektwelve

import org.scalatest._

class PRimesTest extends FunSuite {

  test("Should return list of primes for 2") {
  	var obj = new PRimes()
    assert(obj.primes(2) === List(2))
  }

  test("SHould return list of primes for 3") { 
  	var obj = new PRimes()
    assert(obj.primes(3) === List(2,3))
  }

  test("SHould return list of primes for 4") { 
  	var obj = new PRimes()
    assert(obj.primes(4) === List(2,3))
  }

  test("SHould return list of primes for 5") { 
  	var obj = new PRimes()
    assert(obj.primes(5) === List(2, 3, 5))
  }

  test("SHould return list of primes for 31") { 
  	var obj = new PRimes()
    assert(obj.primes(31) === List(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31))
  }

}