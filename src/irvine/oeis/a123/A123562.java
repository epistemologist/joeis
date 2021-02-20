package irvine.oeis.a123;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;


/**
 * A123562 Pascal-(1,-3,1) array, read by antidiagonals.
 *
 * @author Georg Fischer
 */
public class A123562 extends GeneratingFunctionTriangle {

  /**
   * Construct the sequence.
   */
  public A123562() {
    super(0, new long[] {1, -1, 0}, new long[] {1, -2, -1, 1, 4, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0});
  }
}