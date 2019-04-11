package irvine.oeis.a143;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A143208 <code>a(1)=2</code>; for <code>n&gt;1, a(n) = (4-9*n+3*n^2)/2</code>.
 * @author Georg Fischer
 */
public class A143208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143208() {
    super(new long[] {1L, -3L, 3L}, new long[] {-1L, 2L, 8L}, new long[] {2L});
  } // constructor()
} // A143208
