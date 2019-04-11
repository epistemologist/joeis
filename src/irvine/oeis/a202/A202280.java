package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202280 y-values in the solutions to <code>x^2 -</code> 151*y^2 <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A202280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202280() {
    super(new long[] {-1, 3456296080L}, new long[] {0, 140634693});
  }
}
