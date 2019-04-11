package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274743 Repunits with odd indices multiplied by <code>99,</code> i.e., <code>99*(1, 111, 11111, 1111111, </code>...).
 * @author Sean A. Irvine
 */
public class A274743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274743() {
    super(new long[] {-100, 101}, new long[] {99, 10989});
  }
}
