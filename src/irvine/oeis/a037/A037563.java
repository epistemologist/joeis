package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037563 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,2,1</code>.
 * @author Sean A. Irvine
 */
public class A037563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037563() {
    super(new long[] {-6, 1, 0, 6}, new long[] {2, 14, 85, 512});
  }
}
