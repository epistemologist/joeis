package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003453 Number of nonequivalent dissections of <code>an</code> n-gon into 3 polygons by nonintersecting diagonals up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A003453 implements Sequence {

  private long mN = 4;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      return Z.valueOf(mN - 4).multiply(mN - 2).multiply(mN + 3).divide(24);
    } else {
      return Z.valueOf(mN).square().subtract(13).multiply(mN - 3).divide(24);
    }
  }
}
