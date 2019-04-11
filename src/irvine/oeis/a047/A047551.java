package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047551 Numbers that are congruent to <code>{0, 1, 6, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047551() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 6, 7, 8});
  }
}
