/**
 * Appends one List to another.
 */
 def append[A](first: List[A], second: List[A]): List[A] = first match {
   case Nil => second
   case Cons(h, t) => Cons(h, append(t, second))
 }
 
 
