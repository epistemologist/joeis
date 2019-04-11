package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163815 <code>a(n) = n*(2*n^2 + 5*n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A163815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163815() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 10, 42, 108});
  }
}
