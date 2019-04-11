package irvine.oeis.a097;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A097923 G.f.: <code>(1+x^20)/((1-x)*(1-x^3)*(1-x^5))</code>.
 * @author Georg Fischer
 */
public class A097923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097923() {
    super(new long[] {1, -1, 0, -1, 1, -1, 1, 0, 1}, new long[] {9, 10, 11, 13, 14, 15, 17, 18, 21}, new long[] {1, 1, 1, 2, 2, 3, 4, 4, 5, 6, 7, 8});
  }
}
