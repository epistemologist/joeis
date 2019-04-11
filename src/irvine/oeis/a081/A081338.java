package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081338 <code>(9^n+5^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A081338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081338() {
    super(new long[] {-45, 14}, new long[] {1, 7});
  }
}
