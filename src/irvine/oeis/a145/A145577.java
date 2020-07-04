package irvine.oeis.a145;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a045.A045944;

/**
 * A145577 A045944 mod 9. Period 9: repeat 0,5,7,6,2,4,3,8,1.
 * @author Georg Fischer
 */
public class A145577 implements Sequence {

  final Sequence mA045944 = new A045944();
  /** Construct the sequence. */
  public A145577() {
  }
  
  @Override
  public Z next() {
    return mA045944.next().mod(Z.NINE);
  }

}
