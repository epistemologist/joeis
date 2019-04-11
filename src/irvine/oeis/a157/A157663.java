package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157663 <code>a(n) = 8000*n + 40</code>.
 * @author Sean A. Irvine
 */
public class A157663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157663() {
    super(new long[] {-1, 2}, new long[] {8040, 16040});
  }
}
