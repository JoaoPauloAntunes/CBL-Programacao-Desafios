/*
Faça um programa que leia duas notas de um aluno numa turma de 10 alunos. 
Para cada aluno, calcular a média ponderadas das notas, sabendo que a nota1 tem peso=4 e a nota2 tem peso=6. 
Imprimir a média do aluno e o conceito final, conforme tabela abaixo:

Intervalo     Conceito
9.0 a 10.0    A
7.0 a 8.9     B
5.0 a 6.9     C
0.0 a 4.9     D

Fazer 2 funções:
- Uma função lambda para calcular a media ponderada das notas. Entrada as duas notas; saída: a média.
- Uma função que irá receber como entrada a média das notas calculada pela função lambda e retornar o conceito conforme a tabela acima.
*/
fun main() {
  val n1: Float = 6.0f
  val n2: Float = 7.66f

  val pesoN1: Int = 4
  val pesoN2: Int = 6

  val media = (n1*pesoN1 + n2*pesoN2) / (pesoN1 + pesoN2)
  println("- Média ponderada: ${String.format("%.2f", media)}")

  val conceito = if (media >= 9) "A"
    else if (media >= 7) "B"
    else if (media >= 5) "C"
    else "D"
  println("- Conceito: ${conceito}")
}