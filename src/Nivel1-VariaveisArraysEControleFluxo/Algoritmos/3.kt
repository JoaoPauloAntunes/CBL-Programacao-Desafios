// Faça um programa que calcula e mostra o salário de um funcionário que teve um aumento de 25%.
fun main() {
  print("Salário: ")
  var salario: Float = readLine()!!.toFloat()
  print("Salário após o aumento de 25%: " + String.format("%.2f", salario*1.25))
}