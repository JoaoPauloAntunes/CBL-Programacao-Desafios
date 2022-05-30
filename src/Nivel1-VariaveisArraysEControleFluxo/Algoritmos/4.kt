// Faça um programa que calcula a área de um triângulo. Sabe-se que: Área = (base * altura) / 2
fun main() {
  print("base: ")
  var base: Float = readLine()!!.toFloat()
  
  print("altura: ")
  var altura: Float = readLine()!!.toFloat()
  
  print("Área de triângulo: " + String.format("%.2f", (base * altura) / 2))
}