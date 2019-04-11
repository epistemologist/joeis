package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037700 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,2,3,0</code>.
 * @author Sean A. Irvine
 */
public class A037700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037700() {
    super(new long[] {-9, 1, 0, 0, 9}, new long[] {1, 11, 102, 918, 8263});
  }
}
