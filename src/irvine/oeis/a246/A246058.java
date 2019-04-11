package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246058 <code>(16*10^n-7)/9</code>.
 * @author Sean A. Irvine
 */
public class A246058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246058() {
    super(new long[] {-10, 11}, new long[] {1, 17});
  }
}
