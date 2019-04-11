package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157729 <code>a(n) =</code> Fibonacci(n) <code>+ 5</code>.
 * @author Sean A. Irvine
 */
public class A157729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157729() {
    super(new long[] {-1, 0, 2}, new long[] {5, 6, 6});
  }
}
