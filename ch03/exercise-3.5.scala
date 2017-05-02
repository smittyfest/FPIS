/**
 * Drops elements of a List[A] while those elements match a predicate.
 */
 def dropWhile[A](as: List[A], f: A => Boolean): List[A] = as match {
   case Cons(x, xs) if f(x) => dropWhile(xs, f)
   case _ => as
 }
