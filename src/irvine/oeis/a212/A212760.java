package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212760 Number of (w,x,y,z) with all terms in <code>{0,</code>...,n}, w even, and <code>x =</code> y + z.
 * @author Sean A. Irvine
 */
public class A212760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212760() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 3, 12, 20, 45, 63, 112});
  }
}
