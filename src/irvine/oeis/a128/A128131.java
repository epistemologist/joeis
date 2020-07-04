package irvine.oeis.a128;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000096;

/**
 * A128131 a(n) = 2^A000096(n)*A128130(n).
 * @author Georg Fischer
 */
public class A128131 implements Sequence {

  final Sequence mA000096 = new A000096();
  final Sequence mA128130 = new A128130();
  /** Construct the sequence. */
  public A128131() {
  }
  
  @Override
  public Z next() {
    return Z.TWO.pow(mA000096.next()).multiply(mA128130.next());
  }

}
