package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007907 Concatenation of sequence <code>(1,2,</code>..,[(n-1)/2],[n/2],[n/2]-1,..,1) for <code>n &gt;= 1</code>.
 * @author Sean A. Irvine
 */
public class A007907 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (long k = 1; k <= (mN - 1) / 2; ++k) {
      sb.append(k);
    }
    for (long k = mN / 2; k > 0; --k) {
      sb.append(k);
    }
    return new Z(sb);
  }
}
