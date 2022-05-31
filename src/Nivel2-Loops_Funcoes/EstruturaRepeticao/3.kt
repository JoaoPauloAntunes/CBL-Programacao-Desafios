/*
Faça um programa que mostre as tabuadas dos números de 1 a 10.
*/
fun imprimeTabuadaNum(num: Int) {
  println("\nNúmero: ${num}")
  for (i in 0..10) {
    println("${num} x ${i} = ${num*i}")
  }
}

fun main() {
  for (num in 1..10) {
    imprimeTabuadaNum(num)
  }
}