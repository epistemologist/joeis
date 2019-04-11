package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198847 <code>10*6^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198847() {
    super(new long[] {-6, 7}, new long[] {9, 59});
  }
}
