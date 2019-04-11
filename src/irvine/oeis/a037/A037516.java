package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037516 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,0,1</code>.
 * @author Sean A. Irvine
 */
public class A037516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037516() {
    super(new long[] {-7, 1, 0, 7}, new long[] {2, 14, 99, 695});
  }
}
