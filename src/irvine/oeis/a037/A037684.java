package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037684 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,0,3,2</code>.
 * @author Sean A. Irvine
 */
public class A037684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037684() {
    super(new long[] {-7, 1, 0, 0, 7}, new long[] {1, 7, 52, 366, 2563});
  }
}
