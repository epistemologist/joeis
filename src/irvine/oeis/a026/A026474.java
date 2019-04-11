package irvine.oeis.a026;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A026474 <code>a(n) =</code> least positive integer <code>&gt; a(n-1)</code> and not equal to a(i)+a(j) or a(i)+a(j)+a(k) for 1&lt;=i&lt;j&lt;k&lt;n <code>(a</code> 3-Stohr sequence).
 * @author Georg Fischer
 */
public class A026474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026474() {
    super(new long[] {-1L, 2L}, new long[] {8L, 15L}, new long[] {1L, 2L, 4L});
  } // constructor()
} // A026474
