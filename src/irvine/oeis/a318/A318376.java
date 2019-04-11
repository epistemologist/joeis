package irvine.oeis.a318;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A318376 <code>a(n) =</code> F(n+1)^3 - 3*F(n-1)*F(n)^2, where F(n) = A000045(n), the n-th Fibonacci number.
 * @author Georg Fischer
 */
public class A318376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A318376() {
    super(new long[] {-1, -3, 6, 3}, new long[] {1, 5, 15, 71}, new long[] {1});
  }
}
