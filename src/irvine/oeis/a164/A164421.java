package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164421 Number of binary strings of length n with no substrings equal to <code>0000 0010</code> or 1001.
 * @author Sean A. Irvine
 */
public class A164421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164421() {
    super(new long[] {1, 0, 0, 1, 1}, new long[] {13, 22, 38, 65, 111});
  }
}
