/**
 * Returns the tail of a List[A]
 */
def tail[A](as: List[A]): List[A] = as match {
  case Nil        => List()
  case Cons(x,xs) => xs
}
