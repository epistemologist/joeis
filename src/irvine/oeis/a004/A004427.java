package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A004427 Arithmetic mean of digits of <code>n</code> (rounded up).
 * @author Sean A. Irvine
 */
public class A004427 implements Sequence {

  private long mN = -1;
  private long mLim = 10;
  private long mDiv = 1;

  @Override
  public Z next() {
    final long s = ZUtils.digitSum(++mN);
    if (mN >= mLim) {
      mLim *= 10;
      ++mDiv;
    }
    return Z.valueOf((s + mDiv - 1) / mDiv);
  }
}

