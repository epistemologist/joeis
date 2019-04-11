package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037716 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,0,1,3</code>.
 * @author Sean A. Irvine
 */
public class A037716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037716() {
    super(new long[] {-4, 5, -5, 5}, new long[] {2, 8, 33, 135});
  }
}
