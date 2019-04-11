package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047363 Numbers that are congruent to <code>{0, 2, 3, 4, 5} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047363 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047363() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 2, 3, 4, 5, 7});
  }
}
