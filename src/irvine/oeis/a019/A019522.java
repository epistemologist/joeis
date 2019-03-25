package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019522.
 * @author Sean A. Irvine
 */
public class A019522 implements Sequence {

  private long mN = 0;
  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    mS.append(Z.valueOf(++mN).pow(3));
    return new Z(mS);
  }
}

