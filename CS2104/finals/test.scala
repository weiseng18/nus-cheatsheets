import scala.collection.mutable.HashMap

object Test {
  class Ref[A](v:A):
    var vl = v
    def get:A =
      vl
    def update(nv:A): Unit =
    vl = nv
  end Ref

  def one: Unit =
      for (i <- 0 to 3) println(s"i = $i")

  val f_lst =
    for (i <- 1 to 3; j <- 1 to 3 if i<j)
      yield (i,j)

  // fib with memoization
  def fib_memo(n: Int): Int = {
    val tbl = new HashMap[Int, Int]()
    def aux(n: Int): Int = {
      if (n <= 1) 1
      else {
        val r = tbl.get(n)
        r match {
          case None => {
            val ans = aux(n-1) + aux(n-2)
            tbl.+=((n, ans))
            ans
          }
          case Some(ans) => ans
        }
      }
    }
    aux(n)
  }

  // Inference
  def fac(n: Int): Int = if (n == 0) 1 else n * fac(n - 1)

  // Untyped lambda calculus
  abstract class Term
  case class Var(name: String) extends Term
  case class Fun(arg: String, body: Term) extends Term
  case class App(f: Term, v: Term) extends Term

  val x = Var("x")
  //Console.println(x.name)

  val fruit = List("apples", "oranges", "pears")
  val nums = List(1, 2, 3, 4)

  def length[T](xs:List[T]):Int =
    xs match {
      case List() => 0
      case x :: xs1 => 1+length(xs1)
    }

  def append[T](xs: List[T], ys: List[T]): List[T] =
    xs match {
      case List()   => ys
      case x :: xs1 => x :: append(xs1, ys)
    }

  def sum(xs: List[Int]): Int = (0 /: xs) (_ + _)
  def prod(xs: List[Int]): Int = (1 /: xs) (_ * _)
}
