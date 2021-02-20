package irvine.oeis.a185;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;


/**
 * A185018 Inverse to sequence matrix for natural numbers.
 *
 * @author Georg Fischer
 */
public class A185018 extends GeneratingFunctionTriangle {

  /**
   * Construct the sequence.
   */
  public A185018() {
    super(0, new long[] {1, -2, 0, 1, 0, 0}, new long[] {1, 0, -1, 0, 0, 0});
  }
}