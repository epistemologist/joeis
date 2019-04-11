package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033572 <code>a(n) = (2*n+1)*(7*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A033572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033572() {
    super(new long[] {1, -3, 3}, new long[] {1, 24, 75});
  }
}
