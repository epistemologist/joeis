package irvine.oeis.a156;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001792;
import irvine.oeis.a008.A008683;

/**
 * A156827 A001792*A008683.
 * @author Georg Fischer
 */
public class A156827 implements Sequence {

  final Sequence mA001792 = new A001792();
  final Sequence mA008683 = new A008683();
  /** Construct the sequence. */
  public A156827() {
  }
  
  @Override
  public Z next() {
    return mA001792.next().multiply(mA008683.next());
  }

}
