package dojoweektwelve

class PRimes {

	def primes(n: Integer) = {
		var sieve = Array.fill(n+1){false}
		var primesResult = Array[Int]()

		for(i<-2 to n) {
			if (!sieve(i)) {
				primesResult = primesResult :+ i
				sieve = removeMultiples(i, sieve)
			}
		}
		primesResult
	}

	def removeMultiples(prime: Integer, sieve: Array[Boolean]) = {
		var position = prime
		while(position < sieve.size) {
			sieve(position) = true
			position += prime
		}
		sieve
	}

}