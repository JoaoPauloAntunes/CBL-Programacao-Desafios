/*
2. Faça um programa que tem uma constante que representa o número inteiro, calcule e mostre a tabuada deste número.
    Exemplo:
    Número: 5
    5 x 0 = 0
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50
*/
fun main() {
  val num = 5
  println("Número: ${num}")
  for (i in 0..10) {
    println("${num} x ${i} = ${num*i}")
  }
}