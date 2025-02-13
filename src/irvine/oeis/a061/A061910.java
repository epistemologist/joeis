package irvine.oeis.a061;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A061910 Positive numbers n such that sum of digits of n^2 is a square.
 * @author Sean A. Irvine
 */
public class A061910 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.isSquare(ZUtils.digitSum(Z.valueOf(++mN).square()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
