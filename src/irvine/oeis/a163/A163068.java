package irvine.oeis.a163;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A163068 <code>a(n) = 16*a(n-1) - 59*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 2, a(1) = 21</code>.
 * @author Georg Fischer
 */
public class A163068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163068() {
    super(new long[] {-59L, 16L}, new long[] {2L, 21L});
  } // constructor()
} // A163068
