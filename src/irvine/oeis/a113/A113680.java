package irvine.oeis.a113;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;


/**
 * A113680 Riordan array ((1-x-2x^2)/(1-x),x).
 *
 * @author Georg Fischer
 */
public class A113680 extends GeneratingFunctionTriangle {

  /**
   * Construct the sequence.
   */
  public A113680() {
    super(0, new long[] {1, -1, 0, -2, 0, 0}, new long[] {1, -1, -1, 0, 1, 0, 0, 0, 0, 0});
  }
}