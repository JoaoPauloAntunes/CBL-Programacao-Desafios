// Faça um programa que recebe um número inteiro e verifica se o número é ímpar ou par.
fun main() {
  print("num: ")
  val num: Int = readLine()!!.toInt()

  print("O número é: ")
  println(if (num%2 == 0) "Par" else "Ímpar")
}