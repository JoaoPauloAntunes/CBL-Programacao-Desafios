/*
1. Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se que:
    1. Esse funcionário foi contratado em 2005, com salário inicial de R$ 1.000,00
    2. Em 2006, ele recebeu aumento de 1,5% sobre o seu salário inicial.
    3. A partir de 2007 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.
    
    Faça um programa que determine o salário atual deste funcionário.
*/
fun main() {
  val anoBase = 2005
  val anoAtual = 2022

  val salarioBase = 1000

  var porcentualAumento = 0.015 // a partir de 2006
  for (i in 2..(anoAtual - anoBase)) {
    porcentualAumento *= 2
  }  
  println("Salário atual (R$): ${String.format("%.2f", salarioBase + (salarioBase * porcentualAumento))}")
}