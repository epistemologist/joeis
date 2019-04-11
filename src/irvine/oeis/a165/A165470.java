package irvine.oeis.a165;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A165470 <code>a(0)=1, a(1)=5, a(n) = 20*a(n-2) - a(n-1)</code>.
 * @author Georg Fischer
 */
public class A165470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165470() {
    super(new long[] {20L, -1L}, new long[] {1L, 5L});
  } // constructor()
} // A165470
