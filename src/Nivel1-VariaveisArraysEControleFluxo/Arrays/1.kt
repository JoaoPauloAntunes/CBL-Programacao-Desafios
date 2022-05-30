/*
1. Faça um programa que tem um array de inteiros, calcule e mostre:
    1. a soma dos números;
    2. a quantidade de números;
    3. a média dos números;
    4. o maior número;
    5. o menor número;
    6. a média dos números pares;
    7. a porcentagem dos números ímpares entre todos os números digitados.
*/
fun main() {
  val nums = listOf<Int>(1, 3, 6, 5, 2, 3)

  /* var soma = 0
  for (num in nums) {
    soma += num
  } */ 
  // ou
  println("- soma: ${nums.sum()}")

  println("- quantidade de números: ${nums.size}")
  println("- média dos números: ${nums.average()}")
  println("- maior número: ${nums.max()}")
  println("- menor número: ${nums.min()}")

  val numsPar = nums.filter{it%2 == 0}
  println("- média dos números pares: ${numsPar}.average()}")

  val porcNumsImpares: Float = (1 - (numsPar.size / nums.size.toFloat())) * 100.0f
  println("- porcentagem dos números ímpares entre todos os números digitados: ${String.format("%.2f", porcNumsImpares)}%")

}