package irvine.oeis.a295;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A295717 <code>a(n) = a(n-1) + 3*a(n-2) -2*a(n-3) - 2*a(n-4),</code> where <code>a(0) = 1, a(1) = 3, a(2) = 5, a(3) = 7</code>.
 * @author Georg Fischer
 */
public class A295717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295717() {
    super(new long[] {-2L, -2L, 3L, 1L}, new long[] {1L, 3L, 5L, 7L});
  } // constructor()
} // A295717
