package irvine.oeis.a136;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A136401 <code>a(n) = 3*a(n-1)-4*a(n-2)+6*a(n-3)-4*a(n-4)</code>.
 * @author Georg Fischer
 */
public class A136401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136401() {
    super(new long[] {-4L, 6L, -4L, 3L}, new long[] {0L, 0L, 0L, 1L});
  } // constructor()
} // A136401
