package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037495 Decimal expansion of <code>a(n)</code> is given by the first n terms of the periodic sequence with initial period <code>2,1</code>.
 * @author Sean A. Irvine
 */
public class A037495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037495() {
    super(new long[] {-10, 1, 10}, new long[] {2, 21, 212});
  }
}
