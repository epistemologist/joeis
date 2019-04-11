package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122883 The <code>(1</code>,3)-entry in the 3 X 3 matrix M^n, where M <code>= [1,1,1 / 4,2,1 / 9,3,1]</code>.
 * @author Sean A. Irvine
 */
public class A122883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122883() {
    super(new long[] {-2, 11, 4}, new long[] {1, 3, 23});
  }
}
