import java.nio.file.Paths
import kotlin.text.replace


class Path(path_in: String) {
  val path = Paths.get(
    Paths.get(path_in).toString()
      .replace('\\', '/')
      .replace("/mnt/c", "C:")
  )
  
  fun asWindows() : String {
    return path.toString().replace("\\", "\\\\")
  }
  
  fun asPosix() : String {
    return path.toString().replace('\\', '/')
  }

  fun asWSL() : String {
    return path.toString().replace('\\', '/').replace("C:", "/mnt/c")
  }
}


fun main() {
  print("Path: ")
  val path_in = Path(readLine()!!)

  println("\nResultados:")
  println("- Path ${path_in.path}")
  println("- Windows: ${path_in.asWindows()}")
  println("- POSIX: ${path_in.asPosix()}")
  println("- WSL: ${path_in.asWSL()}")
}
