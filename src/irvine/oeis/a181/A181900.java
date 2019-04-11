package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181900 <code>a(n) =</code> A022998(n) <code>* n</code>.
 * @author Sean A. Irvine
 */
public class A181900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181900() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 1, 8, 9, 32, 25});
  }
}
