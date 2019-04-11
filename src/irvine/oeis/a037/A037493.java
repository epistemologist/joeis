package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037493 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,1</code>.
 * @author Sean A. Irvine
 */
public class A037493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037493() {
    super(new long[] {-8, 1, 8}, new long[] {2, 17, 138});
  }
}
