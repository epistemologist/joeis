package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a007.A007695;

/**
 * A011831 f-vectors for simplicial complexes of dimension at most 6 on at most <code>n-1</code> vertices.
 * @author Sean A. Irvine
 */
public class A011831 extends A007695 {

  private long mN = -1;

  @Override
  public Z next() {
    return f(++mN, 7);
  }
}
