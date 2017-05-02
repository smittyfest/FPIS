/**
 * Appends one List to another.
 */
 def append[A](first: List[A], second: List[A]): List[A] = first match {
   case Nil => second
   case Cons(h, t) => Cons(h, append(t, second))
 }
 
/**
 * Returns all but the last element of a List[A]
 */
def init[A](as: List[A]): List[A] = as match {
  case Nil => Nil
  case Cons(_, Nil) => Nil
  case Cons(h, t) => Cons(h, init(t))
}
