package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060995 Number of routes of length <code>2n</code> on the sides of <code>an</code> octagon from a point to opposite point.
 * @author Sean A. Irvine
 */
public class A060995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060995() {
    super(new long[] {-2, 4}, new long[] {0, 2});
  }
}
