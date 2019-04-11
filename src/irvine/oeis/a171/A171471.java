package irvine.oeis.a171;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A171471 <code>a(n) = 6*a(n-1)-8*a(n-2)-9</code> for <code>n &gt; 2</code>; <code>a(0) = 35, a(1) = 225, a(2) = 837</code>.
 * @author Georg Fischer
 */
public class A171471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171471() {
    super(new long[] {8L, -14L, 7L}, new long[] {225L, 837L, 3213L}, new long[] {35L});
  } // constructor()
} // A171471
