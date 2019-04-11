package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228545 y-values in the solution to the Pell equation <code>x^2 -</code> 61*y^2 <code>= -1</code>.
 * @author Sean A. Irvine
 */
public class A228545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228545() {
    super(new long[] {-1, 3532638098L}, new long[] {3805, 13441687959085L});
  }
}
