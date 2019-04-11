package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196507 <code>a(n) = n*(3*n^2 + 6*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A196507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196507() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 10, 50, 138});
  }
}
