package irvine.oeis.a215;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A215007 <code>a(n) = 7*a(n-1) - 14*a(n-2) + 7*a(n-3), a(0)=1, a(1)=3, a(2)=9</code>.
 * @author Georg Fischer
 */
public class A215007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215007() {
    super(new long[] {7L, -14L, 7L}, new long[] {1L, 3L, 9L});
  } // constructor()
} // A215007
