package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037510 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,2,0</code>.
 * @author Sean A. Irvine
 */
public class A037510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037510() {
    super(new long[] {-9, 1, 0, 9}, new long[] {1, 11, 99, 892});
  }
}
