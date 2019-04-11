package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115419 Numbers having <code>a 1</code> in position 3 of their binary expansion.
 * @author Sean A. Irvine
 */
public class A115419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115419() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {8, 9, 10, 11, 12, 13, 14, 15, 24});
  }
}
