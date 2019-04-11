package irvine.oeis.a303;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A303814 Generalized 24-gonal (or icositetragonal) numbers: m*(11*m <code>- 10)</code> with m <code>= 0, +1, -1, +2, -2, +3, -3, </code>...
 * @author Georg Fischer
 */
public class A303814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A303814() {
    super(new long[] {1L, -1L, -2L, 2L, 1L}, new long[] {0L, 1L, 21L, 24L, 64L});
  } // constructor()
} // A303814
