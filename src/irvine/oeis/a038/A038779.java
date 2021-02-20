package irvine.oeis.a038;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038779 An intermediate sequence for nonisomorphic circulant directed p^2-graphs, indexed by odd primes p.
 * @author Sean A. Irvine
 */
public class A038779 extends A000040 {

  {
    super.next(); // skip 2
  }

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    Z sum = Z.ZERO;
    for (final Z rr : Cheetah.factor(p - 1).divisors()) {
      final int r = rr.intValue();
      sum = sum.add(Z.valueOf(LongUtils.phi(r)).shiftLeft(2 * (p - 1) / r));
    }
    return sum.divide(p - 1);
  }
}