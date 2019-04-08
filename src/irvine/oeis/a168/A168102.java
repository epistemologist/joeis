package irvine.oeis.a168;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A168102 a(n) = sum of natural numbers m such that n - 3 &lt;= m &lt;= n + 3.
 * @author Georg Fischer
 */
public class A168102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168102() {
    super(new long[] {-1, 2}, new long[] {21, 28}, new long[] {6, 10, 15});
  }
}
