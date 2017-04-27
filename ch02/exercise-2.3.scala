/**
 * Polymorphic Higher-Order Function for
 * Partial-Application
 */
def partial1[A,B,C](a: A, f: (A,B) => C): B => C = {
  (b: B) => f(a, b)
}

/**
 * Polymorphic Higher-Order Function for
 * Currying
 */
 def curry[A,B,C](f: (A,B) => C): A => (B => C) = {
   (a: A) => (b: B) => f(a, b)
 }
