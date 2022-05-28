/*
Faça um programa que preencha um vetor com 10 números inteiros aleatórios entre 1 e 12, 
calcule e mostre o vetor resultado de uma ordenação decrescente.
*/
import kotlin.random.Random


fun main() {
  // val nums = listOf<Int>(1, 8, 5, 6, 3, 2, 7, 4, 12, 11)
  val nums = List(10){Random.nextInt(1, 13)}
  println(nums.sortedDescending())
}