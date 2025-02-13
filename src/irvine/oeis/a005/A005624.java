package irvine.oeis.a005;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;
import irvine.util.Pair;

/**
 * A005624 Spiral sieve using Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A005624 extends A000045 {

  {
    setOffset(1);
    super.next();
    super.next();
  }

  // Some reordering of entries is necessary
  private final TreeSet<Z> mNotYetReturned = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Pair<Z, Z> pos = A005620.ulamSpiralToXY(t);
      mNotYetReturned.add(A005620.xyToUlamSpiral(pos.right().negate(), pos.left().negate()));
      if (mNotYetReturned.first().square().compareTo(t) <= 0) {
        return mNotYetReturned.pollFirst();
      }
    }
  }

}

