/*
Faça um programa que tem um vetor com nove números inteiros, calcule e mostre os números primos e suas respectivas posições.
*/
import kotlin.math.sqrt


fun verificaPrimo(num: Int): Boolean {
  // 2 é primo
  if (num == 2) {
    return true
  }
  // todo número menor do que 2 ou par (exceto 2) não é primo
  if (num < 2 || num%2 == 0) {
    return false
  }

  var isPrimo = true
  val raizPrimo: Int = sqrt(num.toDouble()).toInt()
  for(i in 3..raizPrimo step 2) { 
    if (num%i == 0) {
      isPrimo = false
      break
    }
  }
  return isPrimo
}


fun main() {
  // print((1..547).toList().filter{verificaPrimo(it) == true})

  val nums = listOf<Int>(
    31, // 0 
    8,  // 1
    5,  // 2
    6,  // 3
    3,  // 4
    2,  // 5
    7,  // 6
    21, // 7
    15  // 8
  )
  for (num in nums.filter{verificaPrimo(it) == true}) {
    println("${num} \t=> ${nums.indexOf(num)}")
  }
}
/*
31      => 0
5       => 2
3       => 4
2       => 5
7       => 6
*/