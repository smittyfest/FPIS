/**
 * Returns a new List[A] with 'a' as
 * the head of the List.
 */
def setHead[A](a: A, as: List[A]): List[A] = as match {
  case Nil       => Cons(a, Nil)
  case Cons(_,t) => Cons(a,t)
}
