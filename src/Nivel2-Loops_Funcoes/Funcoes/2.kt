// Crie uma função que recebe um número inteiro e retorna 0 se o número for positivo e 1 se o número for negativo.
fun verificaSinalNum(num: Int): Int {
  return if (num >= 0) 0 else 1
}


fun main() {
  println(verificaSinalNum(1))
  println(verificaSinalNum(-1))
  println(verificaSinalNum(8))
  println(verificaSinalNum(0))
  println(verificaSinalNum(-6))
}