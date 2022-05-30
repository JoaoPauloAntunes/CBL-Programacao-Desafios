/*
Faça uma função que recebe um vetor A como parâmetro, o vetor A deve possuir 10 números inteiros. 
Ao final dessa função, deverá ter sido gerado um vetor B contendo o fatorial de cada elemento de A.
*/
fun fatorial(num: Int): Long {
  var fat: Long = 1
  for (i in 1..num) {
    fat *= i
  }
  return fat
}


fun calcListaFatorial(lista: List<Int>): List<Long> {
  val listaFat = mutableListOf<Long>()
  for (num in lista) {
    listaFat.add(fatorial(num))
  }
  return listaFat
}


fun main() {
  println(calcListaFatorial((1..10).toList()))
}