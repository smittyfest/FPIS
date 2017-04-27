/**
 * Polymorphic Higher-Order Function
 * for UnCurrying
 */
 def uncurry[A,B,C](f: A => B => C): (A,B) => C = {
   (a: A, b: B) => f(a)(b)
 }
