package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037734 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,1,0,3</code>.
 * @author Sean A. Irvine
 */
public class A037734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037734() {
    super(new long[] {-8, 1, 0, 0, 8}, new long[] {2, 17, 136, 1091, 8730});
  }
}
