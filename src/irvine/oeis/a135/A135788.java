package irvine.oeis.a135;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000404;

/**
 * A135788 a(n) = A000404(n)^6.
 * @author Georg Fischer
 */
public class A135788 implements Sequence {

  final Sequence mA000404 = new A000404();
  /** Construct the sequence. */
  public A135788() {
  }
  
  @Override
  public Z next() {
    return mA000404.next().pow(Z.SIX);
  }

}
