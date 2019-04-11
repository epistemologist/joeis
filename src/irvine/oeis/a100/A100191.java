package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100191 The <code>(1</code>,1)-entry in the 3 X 3 matrix M^n, where M <code>= [1,2,1 / 2,2,0 / 1,0,0]</code>.
 * @author Sean A. Irvine
 */
public class A100191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100191() {
    super(new long[] {-2, 3, 3}, new long[] {1, 6, 19});
  }
}
