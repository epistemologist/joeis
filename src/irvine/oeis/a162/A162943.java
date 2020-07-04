package irvine.oeis.a162;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002321;

/**
 * A162943 2^(1-A002321).
 * @author Georg Fischer
 */
public class A162943 implements Sequence {

  final Sequence mA002321 = new A002321();
  /** Construct the sequence. */
  public A162943() {
  }
  
  @Override
  public Z next() {
    return Z.TWO.pow(Z.ONE.subtract(mA002321.next()));
  }

}
