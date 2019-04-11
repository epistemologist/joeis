package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088556 Numbers of the form <code>(4^n + 4^(n-1) + </code>... <code>+ 1) + (n mod 2)</code>.
 * @author Sean A. Irvine
 */
public class A088556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088556() {
    super(new long[] {-4, 1, 4}, new long[] {6, 21, 86});
  }
}
