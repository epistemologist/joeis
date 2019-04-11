package irvine.oeis.a038;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A038122 Start with <code>{1,2,</code>...,n}, replace any two numbers a,b with |a^2-b^2|, repeat until single number k remains; <code>a(n) =</code> minimal value of k.
 * @author Georg Fischer
 */
public class A038122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038122() {
    super(new long[] {1L, 0L, 0L, -1L, 0L, 0L, 1L, 0L, 0L}, new long[] {0L, 3L, 1L, 0L, 0L, 1L, 3L, 0L, 4L}, new long[] {1L, 3L, 0L, 16L, 15L, 63L, 8L});
  } // constructor()
} // A038122
