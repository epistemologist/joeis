package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032560 Quotient of <code>'base-14'</code> division described in <code>A032559</code>.
 * @author Sean A. Irvine
 */
public class A032560 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z[] qr = new Z(Long.toString(++mN), 14).divideAndRemainder(Z.valueOf(mN));
      if (Z.ZERO.equals(qr[1])) {
        return qr[0];
      }
    }
  }
}
