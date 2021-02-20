package irvine.oeis.a188;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;


/**
 * A188316 Riordan array (1/(1-x^2), x/((1-x)*(1-x^2))).
 *
 * @author Georg Fischer
 */
public class A188316 extends GeneratingFunctionTriangle {

  /**
   * Construct the sequence.
   */
  public A188316() {
    super(0, new long[] {1, -1, 0, -1, 0, 0, 1, 0, 0, 0}, new long[] {1, -1, -1, -2, 0, 0, 2, 1, 0, 0, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0});
  }
}