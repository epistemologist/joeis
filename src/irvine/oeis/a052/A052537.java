package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052537 Expansion of <code>(1-x)/(1-x-2x^3)</code>.
 * @author Sean A. Irvine
 */
public class A052537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052537() {
    super(new long[] {2, 0, 1}, new long[] {1, 0, 0});
  }
}
