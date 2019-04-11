package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124297 <code>a(n) =</code> 5*F(n)^2 + 5*F(n) <code>+ 1,</code> where F(n) = Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A124297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124297() {
    super(new long[] {-1, 2, 4, -6, -2, 4}, new long[] {1, 11, 11, 31, 61, 151});
  }
}
