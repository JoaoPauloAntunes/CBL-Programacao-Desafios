/*
1. A nota final de um estudante é calculada a partir de três notas atribuídas, respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame final. A média das três notas mencionadas obedece aos pesos a seguir:

| NOTA | PESO |
| --- | --- |
| Trabalho de Laboratório | 2 |
| Avaliação semestral | 3 |
| Exame final | 5 |

Faça um programa que tem três constantes que representa as três notas, calcule e mostre a média ponderada e o conceito que segue a tabela.

| MÉDIA PONDERADA | CONCEITO |
| --- | --- |
| ≥ 8 e ≤ 10 | A |
| ≥ 7 e < 8 | B |
| ≥ 6 e < 7 | C |
| ≥ 5 e < 6 | D |
| ≥ 0 e < 5 | E |
|  |  |
*/
fun main() {
  val notaTrabLab: Float = 5.0f
  val notaAvaliacaoSemestral: Float = 5.0f
  val notaExameFinal: Float = 10.0f

  val pesoTrabLab: Int = 2
  val pesoAvaliacaoSemestral: Int = 3
  val pesoExameFinal: Int = 5

  val media = (notaTrabLab*pesoTrabLab + notaAvaliacaoSemestral*pesoAvaliacaoSemestral + notaExameFinal*pesoExameFinal) / 
    (pesoTrabLab + pesoAvaliacaoSemestral + pesoExameFinal)
  println("- Média ponderada: ${String.format("%.2f", media)}")

  val conceito = if (media >= 8) "A"
    else if (media >= 7) "B"
    else if (media >= 6) "C"
    else if (media >= 5) "D"
    else "E"
  println("- Conceito: ${conceito}")
}