package irvine.oeis.a060;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;


/**
 * A060098 Triangle of partial sums of column sequences of triangle A060086.
 *
 * @author Georg Fischer
 */
public class A060098 extends GeneratingFunctionTriangle {

  /**
   * Construct the sequence.
   */
  public A060098() {
    super(0, new long[] {1, -1, 0, -1, 0, 0, 1, 0, 0, 0}, new long[] {1, -2, -1, 0, 1, 0, 2, 0, 0, 0, -1, 0, 0, 0, 0});
  }
}