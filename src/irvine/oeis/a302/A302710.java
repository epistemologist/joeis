package irvine.oeis.a302;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A302710 <code>a(n) =</code> trinomial(2*n, <code>4) = (1/6)*n*(2*n - 1)*(2*n^2 + 7*n - 3)</code>.
 * @author Georg Fischer
 */
public class A302710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A302710() {
    super(new long[] {1L, -5L, 10L, -10L, 5L}, new long[] {0L, 1L, 19L, 90L, 266L});
  } // constructor()
} // A302710
