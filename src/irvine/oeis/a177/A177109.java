package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177109 <code>a(n) = 4*(10^n-5)</code>.
 * @author Sean A. Irvine
 */
public class A177109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177109() {
    super(new long[] {-10, 11}, new long[] {20, 380});
  }
}
