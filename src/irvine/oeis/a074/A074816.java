package irvine.oeis.a074;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001221;

/**
 * A074816 a(n) = 3^A001221(n) = 3^omega(n).
 * @author Georg Fischer
 */
public class A074816 implements Sequence {

  final Sequence mA001221 = new A001221();
  /** Construct the sequence. */
  public A074816() {
  }
  
  @Override
  public Z next() {
    return Z.THREE.pow(mA001221.next());
  }

}
