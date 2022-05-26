/*
Faça um programa tem o número de horas trabalhadas e o valor do salário mínimo, 
calcule e mostre o salário a receber, seguindo as etapas:
1. a hora trabalhada vale a metade do salário mínimo;
2. o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada.
3. o imposto equivale a 3% do salário bruto.
4. o salário a receber equivale ao salário bruto menos o imposto
*/
fun main() {
  val numHorasTrabalhadas: Int = 10
  val salarioMin: Float = 1212.0f

  val valorHoraTrabalhada: Float = salarioMin / 2
  val salarioBruto: Float = numHorasTrabalhadas * valorHoraTrabalhada
  val imposto: Float = salarioBruto * 0.03f

  println("Salário a receber: R$" + String.format("%.2f", salarioBruto - imposto))
}