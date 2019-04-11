package irvine.oeis.a295;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A295730 <code>a(n) = a(n-1) + 3*a(n-2) -2*a(n-3) - 2*a(n-4),</code> where <code>a(0) = -1, a(1) = 0, a(2) = 0, a(3) = 1</code>.
 * @author Georg Fischer
 */
public class A295730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295730() {
    super(new long[] {-2L, -2L, 3L, 1L}, new long[] {-1L, 0L, 0L, 1L});
  } // constructor()
} // A295730
