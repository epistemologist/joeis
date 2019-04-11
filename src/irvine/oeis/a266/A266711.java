package irvine.oeis.a266;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A266711 Coefficient of x in the minimal polynomial of the continued fraction <code>[1^n,sqrt(2),1,1,</code>...], where <code>1^n</code> means n ones.
 * @author Georg Fischer
 */
public class A266711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266711() {
    super(new long[] {1L, -5L, -15L, 15L, 5L}, new long[] {-102L, -714L, -4826L, -33222L, -227298L}, new long[] {-6L, 2L, 18L});
  } // constructor()
} // A266711
