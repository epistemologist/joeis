package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255633 Number of n-length words on <code>{0,1,2,3,4,5}</code> avoiding runs of zeros of length <code>1 (mod 3)</code>.
 * @author Sean A. Irvine
 */
public class A255633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255633() {
    super(new long[] {6, 0, 5}, new long[] {1, 5, 26});
  }
}
