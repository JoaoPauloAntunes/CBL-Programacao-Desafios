// Faça um programa que soma quatro número inteiros e exibe o resultado da soma no console.
fun main() {
  print("n1: ")
  val n1: Int = readLine()!!.toInt()
  print("n2: ")
  val n2: Int = readLine()!!.toInt()
  print("n3: ")
  val n3: Int = readLine()!!.toInt()
  print("n4: ")
  val n4: Int = readLine()!!.toInt()

  print("\nSoma: ${n1 + n2 + n3 + n4}")
}