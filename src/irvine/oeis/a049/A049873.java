package irvine.oeis.a049;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A049873 a(n)=Sum{a(k): k=0,1,2,...,n-4,n-2,n-1}; <code>a(n-3)</code> is not a summand; 3 initial terms required.
 * @author Georg Fischer
 */
public class A049873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049873() {
    super(new long[] {1L, -1L, 0L, 2L}, new long[] {2L, 2L, 3L, 5L});
  } // constructor()
} // A049873
