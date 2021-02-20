package irvine.oeis.a110;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;


/**
 * A110814 Inverse of a triangle of pyramidal numbers.
 *
 * @author Georg Fischer
 */
public class A110814 extends GeneratingFunctionTriangle {

  /**
   * Construct the sequence.
   */
  public A110814() {
    super(0, new long[] {1, 1, 0}, new long[] {1, 4, -1, 5, -3, 0, 2, -2, 0, 0, 0, 0, 0, 0, 0});
  }
}