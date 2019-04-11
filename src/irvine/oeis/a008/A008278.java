package irvine.oeis.a008;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008278 Triangle of Stirling numbers of 2nd kind, S(n,n-k+1), <code>n &gt;= 1,</code> 1&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A008278 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = ++mN;
    }
    return Stirling.secondKind(mN, mM);
  }
}

