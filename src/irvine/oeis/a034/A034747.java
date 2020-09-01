package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034747 Dirichlet convolution of Fibonacci numbers with sigma(n).
 * @author Sean A. Irvine
 */
public class A034747 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Cheetah.factor(mN / d).sigma().multiply(Fibonacci.fibonacci(d)));
    }
    return sum;
  }
}
