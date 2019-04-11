package irvine.oeis.a318;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A318609 <code>a(1) = 2, a(2) = 4, a(3) = 6</code>; for <code>n &gt; 3, a(n) = 3*a(n-1) - 3*a(n-2) + 9*a(n-3)</code>.
 * @author Georg Fischer
 */
public class A318609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A318609() {
    super(new long[] {9L, -3L, 3L}, new long[] {2L, 4L, 6L});
  } // constructor()
} // A318609
