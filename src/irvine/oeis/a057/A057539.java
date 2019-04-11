package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057539 Birthday set of order <code>7,</code> i.e., numbers congruent to <code>+/- 1</code> modulo <code>2, 3, 4, 5, 6</code> and 7.
 * @author Sean A. Irvine
 */
public class A057539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057539() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 29, 41, 71, 139, 169, 181, 209, 211});
  }
}
