package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037798 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,2,1,0</code>.
 * @author Sean A. Irvine
 */
public class A037798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037798() {
    super(new long[] {-9, 1, 0, 0, 9}, new long[] {3, 29, 262, 2358, 21225});
  }
}
