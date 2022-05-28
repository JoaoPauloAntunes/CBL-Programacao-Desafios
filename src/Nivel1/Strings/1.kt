/*
1. Escreva tenha uma `String` ****e uma operação que retorna true se a string for lida da mesma forma quando invertida, 
ignorando maiúsculas e minúsculas.
- A string “rotator” deve retornar true.
- A string “Rats live on no evil star” deve retornar true.
- A string “Hello, world” deve retornar false porque lê “dlrow ,olleH” de trás para frente.
*/
fun isPalindrome(str: String): Boolean {
  return str == str.reversed()
}


fun main() {
  print("Digite uma string: ")
  // val str: String = "Joaoj"
  val str: String = readLine()!!
  println(isPalindrome(str.lowercase()))
}