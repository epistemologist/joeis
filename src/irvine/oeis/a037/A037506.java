package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037506 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,2,0</code>.
 * @author Sean A. Irvine
 */
public class A037506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037506() {
    super(new long[] {-5, 1, 0, 5}, new long[] {1, 7, 35, 176});
  }
}
