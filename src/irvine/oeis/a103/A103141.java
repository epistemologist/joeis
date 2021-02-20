package irvine.oeis.a103;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;


/**
 * A103141 Riordan array (1/(1-x), x*(1 + x + x^2 + x^3)/(1-x)).
 *
 * @author Georg Fischer
 */
public class A103141 extends GeneratingFunctionTriangle {

  /**
   * Construct the sequence.
   */
  public A103141() {
    super(0, new long[] {1, -1, 0}, new long[] {1, -2, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}