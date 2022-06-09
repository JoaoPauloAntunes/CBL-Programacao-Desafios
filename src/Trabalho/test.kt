// import java.nio.file.Path
import java.nio.file.Paths
import kotlin.text.replace


fun main() {
  print("Path: ")
  // val path = Paths.get(readLine()!!)
  val path = Paths.get("C:/Users/joao/Documents/CBL-Programacao-Desafios/main.kt")

  println()
  println("- Windows: ${path.toString()}")

  val posix = path.toString().replace('\\', '/')
  println("- POSIX: ${posix}")

  println("- WSL: ${posix.replace("C:", "/mnt/c")}")
}
