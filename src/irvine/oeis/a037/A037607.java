package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037607 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,2,3</code>.
 * @author Sean A. Irvine
 */
public class A037607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037607() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 9, 66, 463});
  }
}
