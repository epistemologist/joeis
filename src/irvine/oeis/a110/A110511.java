package irvine.oeis.a110;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;


/**
 * A110511 Riordan array (1/(1+x), x(1-x)/(1+x)^2).
 *
 * @author Georg Fischer
 */
public class A110511 extends GeneratingFunctionTriangle {

  /**
   * Construct the sequence.
   */
  public A110511() {
    super(0, new long[] {1, 2, 0, 1, 0, 0}, new long[] {1, 3, -1, 3, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0});
  }
}