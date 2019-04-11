package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126628 <code>a(n)</code> is the number of nonnegative integers k less than <code>10^n</code> such that the decimal representation of k lacks digits 1 and <code>2,</code> at least one of digits <code>3,4</code> and at least one of digits <code>5,6,7,8,9</code>.
 * @author Sean A. Irvine
 */
public class A126628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126628() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {8, 62, 470, 3506, 25718, 184682});
  }
}
