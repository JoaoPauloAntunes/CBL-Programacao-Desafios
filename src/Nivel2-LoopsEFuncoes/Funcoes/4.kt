/*
Elabore uma função que retorne um vetor com os três primeiros números perfeitos. 
Sabe-se que um número é perfeito quando é igual à soma 
de seus divisores (exceto ele mesmo). Exemplo: os divisores de 6 são 1,2,3 e 1 + 2 + 3 = 6, logo 6 é perfeito.
*/
fun isNumPerfeito(num: Int): Boolean {
  var temp = 0
  for (i in 1..(num / 2)) {
    if (num % i == 0) {
      temp += i
    }
  }
  return temp == num
}


fun calcNumPerfeitos(): List<Int> {
  return (1..500).filter({isNumPerfeito(it)})
}


fun main() {
  println(calcNumPerfeitos())
  println(calcNumPerfeitos() == listOf<Int>(6, 28, 496))
}