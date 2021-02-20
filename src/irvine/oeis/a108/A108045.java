package irvine.oeis.a108;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;


/**
 * A108045 Triangle read by rows: lower triangular matrix obtained by inverting the lower triangular matrix in A108044.
 *
 * @author Georg Fischer
 */
public class A108045 extends GeneratingFunctionTriangle {

  /**
   * Construct the sequence.
   */
  public A108045() {
    super(0, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0}, new long[] {1, 0, -1, 2, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0});
  }
}