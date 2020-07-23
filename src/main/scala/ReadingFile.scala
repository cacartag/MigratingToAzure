import scala.io.Source

object ReadingFile extends App{

  println("Reading from file")

  Source.fromResource("Testing").getLines().foreach(println)
  println("Hello All")
}