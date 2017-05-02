/**
 * Drops the first n elements from a List[A]
 */
def drop[A](as: List[A], n: Int): List[A] = {
  if (n <= 0) as
  else as match {
    case Nil => Nil
    case Cons(_, t) => drop(t, n-1)
  }
}
