package irvine.oeis.a292;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A292765 A292764(n)/2.
 * @author Georg Fischer
 */
public class A292765 implements Sequence {

  final Sequence mA292764 = new A292764();
  /** Construct the sequence. */
  public A292765() {
  }
  
  @Override
  public Z next() {
    return mA292764.next().divide(Z.TWO);
  }

}
