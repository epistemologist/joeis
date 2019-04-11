package irvine.oeis.a007;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007406 Wolstenholme numbers: numerator of Sum 1/k^2, k <code>= 1</code>..n.
 * @author Sean A. Irvine
 */
public class A007406 implements Sequence {

  private long mN = 0;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, Z.valueOf(++mN).square()));
    return mSum.num();
  }
}

