package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047946 <code>a(n) =</code> 5*F(n)^2 <code>+ 3*(-1)^n</code> where F(n) are the Fibonacci numbers A000045.
 * @author Sean A. Irvine
 */
public class A047946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047946() {
    super(new long[] {-1, 2, 2}, new long[] {3, 2, 8});
  }
}
