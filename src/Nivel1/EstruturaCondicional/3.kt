// Faça um programa que tem três constantes que representam números, o programa deve mostrar os números em ordem crescente.
fun main() {
  var num1: Int = 7
  var num2: Int = 5
  var num3: Int = 9
  var temp: Int?

  if (num2 > num1) { // num2 <-> num1
    temp = num1
    num1 = num2
    num2 = temp
  }

  if (num3 > num1) { // num3 <-> num1
    temp = num1
    num1 = num3
    num3 = temp
  }

  if (num3 > num2) { // num3 <-> num2
    temp = num2
    num2 = num3
    num3 = temp
  }

  println("Números em ordem crescente: ${num1} ${num2} ${num3}")
}