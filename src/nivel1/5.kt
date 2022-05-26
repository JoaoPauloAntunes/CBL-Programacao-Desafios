/*
5. Faça um programa que calcula:
- o número ao quadrado;
- o número ao cubo;
- a raiz quadrada;
- a raiz cúbica;
*/
fun main() {
  print("Número: ")
  val num: Double = readLine()!!.toDouble()
  
  println("- ${String.format("%.2f", num)} ao quadrado: ${String.format("%.2f", Math.pow(num, 2.0))}")
  println("- ${String.format("%.2f", num)} ao cubo: ${String.format("%.2f", Math.pow(num, 3.0))}")
  println("- Raíz quadrada de ${String.format("%.2f", num)}: ${String.format("%.2f", Math.pow(num, 1.0/2.0))}")
  println("- Raíz cúbica de ${String.format("%.2f", num)}: ${String.format("%.2f", Math.pow(num, 1.0/3.0))}")
}