package irvine.oeis.a124;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;


/**
 * A124725 Triangle read by rows: T(n,k) = binomial(n,k) + binomial(n,k+2) (0 &lt;= k &lt;= n).
 *
 * @author Georg Fischer
 */
public class A124725 extends GeneratingFunctionTriangle {

  /**
   * Construct the sequence.
   */
  public A124725() {
    super(0, new long[] {1, -3, 0, 4, 0, 0, -2, 0, 0, 0}, new long[] {1, -4, -1, 6, 3, 0, -4, -3, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}