/*
4. Faça um programa que preencha um vetor com 10 elementos inteiros aleatórios entre 1 e 100. Calcule e mostre:
    1. todos os números pares;
    2. a quantidade de números pares;
    3. todos os números ímpares;
    4. a quantidade de números ímpares;
*/
import kotlin.random.Random


fun main() {
  val nums = List(10){Random.nextInt(1, 101)}
  // val nums = listOf<Int>(85, 8, 73, 38, 12, 72, 15, 79, 41, 27)
  println(nums)

  val numsPares = mutableListOf<Int>()
  val numsImpares = mutableListOf<Int>()
  nums.forEach {
    if (it % 2 == 0) {
      numsPares.add(it)
    } else {
      numsImpares.add(it)
    }
  }
  println("- Números pares: ${numsPares}")
  println("- Qtd números pares: ${numsPares.size}")
  println("- Números ímpares: ${numsImpares}")
  println("- Qtd números ímpares: ${numsImpares.size}")
}