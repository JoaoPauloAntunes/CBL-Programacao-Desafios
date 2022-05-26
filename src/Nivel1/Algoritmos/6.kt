/*
Faça um programa que tem o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
1. a idade dessa pessoa;
2. quantos anos ela terá em 2050;
*/
fun main() {
  var anoNascimento: Int = 1999
  var anoAtual: Int = 2022
  
  println("Idade: ${anoAtual - anoNascimento}")
  println("Idade em 2050: ${2050 - anoNascimento}")
}