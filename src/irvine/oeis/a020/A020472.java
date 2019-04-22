package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020472.
 * @author Sean A. Irvine
 */
public class A020472 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z m = new Z(Long.toBinaryString(mN).substring(1).replace('1', '9').replace('0', '8'));
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
