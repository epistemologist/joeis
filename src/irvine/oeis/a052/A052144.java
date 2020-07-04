package irvine.oeis.a052;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000172;

/**
 * A052144 A000172(n)^2.
 * @author Georg Fischer
 */
public class A052144 implements Sequence {

  final Sequence mA000172 = new A000172();
  /** Construct the sequence. */
  public A052144() {
  }
  
  @Override
  public Z next() {
    return mA000172.next().pow(Z.TWO);
  }

}
