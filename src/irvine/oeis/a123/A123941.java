package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123941 The <code>(1</code>,2)-entry in the 3 X 3 matrix M^n, where M <code>= {{2, 1, 1}, {1, 1, 0}, {1, 0, 0}}</code>.
 * @author Sean A. Irvine
 */
public class A123941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123941() {
    super(new long[] {-1, 0, 3}, new long[] {0, 1, 3});
  }
}
