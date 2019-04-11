package irvine.oeis.a184;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A184537 <code>a(n) = floor(1/{(2+n^4)^(1/4)}),</code> where <code>{} =</code> fractional part.
 * @author Georg Fischer
 */
public class A184537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184537() {
    super(new long[] {-1L, 4L, -6L, 4L}, new long[] {16L, 54L, 128L, 250L}, new long[] {5L, 3L});
  } // constructor()
} // A184537
