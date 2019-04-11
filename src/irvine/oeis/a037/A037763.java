package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037763 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,0,1,2</code>.
 * @author Sean A. Irvine
 */
public class A037763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037763() {
    super(new long[] {-9, 1, 0, 0, 9}, new long[] {3, 27, 244, 2198, 19785});
  }
}
