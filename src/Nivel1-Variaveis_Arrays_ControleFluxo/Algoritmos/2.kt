// Faça um programa que calcule a média de três notas e exibe o resultado no console.
fun main() {
  print("n1: ")
  val n1: Float = readLine()!!.toFloat()

  print("n2: ")
  val n2: Float = readLine()!!.toFloat()

  print("n3: ")
  val n3: Float = readLine()!!.toFloat()

  // print("Média das 3 notas: ${String.format("%.2f", (n1+n2+n3) / 3.0f)}") // ou
  print("Média das 3 notas: " + String.format("%.2f", (n1+n2+n3) / 3.0f))
}