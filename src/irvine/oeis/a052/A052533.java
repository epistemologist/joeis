package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052533 Expansion of <code>(1-x)/(1-x-3x^2)</code>.
 * @author Sean A. Irvine
 */
public class A052533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052533() {
    super(new long[] {3, 1}, new long[] {1, 0});
  }
}
