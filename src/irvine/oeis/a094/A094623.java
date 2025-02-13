package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094623 Expansion of x*(1+10*x)/((1-x)*(1-10*x^2)).
 * @author Sean A. Irvine
 */
public class A094623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094623() {
    super(new long[] {-10, 10, 1}, new long[] {0, 1, 11});
  }
}
