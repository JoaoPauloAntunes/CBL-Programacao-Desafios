/*
Escreva um código que tenha uma string e retorne quantas vezes um caractere específico aparece, 
levando em consideração maiúsculas e minúsculas.
*/
fun main() {
  // val str = "abacate"
  // val ch = 'a'
  print("- Digite uma string: ")
  val str: String = readLine()!!
  print("- Digite um caractere para contar: ")
  val ch: Char = readLine()!![0]

  println("\n- Qtd de '${ch}': ${str.filter{it == ch}.count()}")
}