package irvine.oeis.a108;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A108142 <code>a[1] = 1</code>; <code>a[2] = 1</code>; <code>a[3] = 1</code>; <code>a[4] = 1</code>; <code>a[5] = 1</code>; <code>a[6] = 1</code>; for <code>n &gt;= 7, a[n] = 6*a[n - 1] - 5*a[n - 2] - 4*a[n - 3] - 3*a[ n - 4] + 2*a[n - 5] + a[n - 6]</code>; then take absolute values.
 * @author Georg Fischer
 */
public class A108142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108142() {
    super(new long[] {1L, 2L, -3L, -4L, -5L, 6L}, new long[] {3L, 27L, 151L, 759L, 3679L, 17599L}, new long[] {1L, 1L, 1L, 1L, 1L, 1L});
  } // constructor()
} // A108142
