package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037717 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,0,1,3</code>.
 * @author Sean A. Irvine
 */
public class A037717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037717() {
    super(new long[] {-5, 6, -6, 6}, new long[] {2, 10, 51, 258});
  }
}
