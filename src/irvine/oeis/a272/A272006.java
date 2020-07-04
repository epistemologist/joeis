package irvine.oeis.a272;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003617;
import irvine.oeis.a062.A062397;

/**
 * A272006 a(n) = A003617(n) - A062397(n-1).
 * @author Georg Fischer
 */
public class A272006 implements Sequence {

  final Sequence mA003617 = new A003617();
  final Sequence mA062397 = new A062397();
  /** Construct the sequence. */
  public A272006() {
  }
  
  @Override
  public Z next() {
    return mA003617.next().subtract(mA062397.next());
  }

}
