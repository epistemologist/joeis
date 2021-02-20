package irvine.oeis.a104;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;


/**
 * A104578 A Padovan convolution triangle.
 *
 * @author Georg Fischer
 */
public class A104578 extends GeneratingFunctionTriangle {

  /**
   * Construct the sequence.
   */
  public A104578() {
    super(0, new long[] {1, 0, 0, -1, 0, 0, -1, 0, 0, 0}, new long[] {1, 0, -1, -2, 0, 0, -2, 1, 0, 0, 1, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0});
  }
}