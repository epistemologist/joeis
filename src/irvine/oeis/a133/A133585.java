package irvine.oeis.a133;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A133585 Expansion of <code>x - x^2*(2*x+1)*(x^2-2) / ( (x^2-x-1)*(x^2+x-1) )</code>.
 * @author Georg Fischer
 */
public class A133585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133585() {
    super(new long[] {-1L, 0L, 3L, 0L}, new long[] {2L, 4L, 5L, 10L}, new long[] {1L});
  } // constructor()
} // A133585
