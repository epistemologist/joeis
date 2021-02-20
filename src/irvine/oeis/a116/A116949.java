package irvine.oeis.a116;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;


/**
 * A116949 Riordan array ((1-x^3)/(1+2x^2),x).
 *
 * @author Georg Fischer
 */
public class A116949 extends GeneratingFunctionTriangle {

  /**
   * Construct the sequence.
   */
  public A116949() {
    super(0, new long[] {1, 0, 0, 0, 0, 0, -1, 0, 0, 0}, new long[] {1, 0, -1, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0});
  }
}