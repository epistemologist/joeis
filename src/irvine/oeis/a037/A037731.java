package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037731 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,1,0,3</code>.
 * @author Sean A. Irvine
 */
public class A037731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037731() {
    super(new long[] {-5, 1, 0, 0, 5}, new long[] {2, 11, 55, 278, 1392});
  }
}
