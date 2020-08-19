package irvine.oeis.a003;

import irvine.math.group.PolynomialRing;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattice;
import irvine.math.lattice.SquareLattice;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003203 Cluster series for square lattice.
 * @author Sean A. Irvine
 */
public class A003203 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = RING.oneMinusXToTheN(1);
  private static final Lattice Z2 = new SquareLattice();
  private int mN = 0;
  private Polynomial<Z> mS = RING.one();
  private long[] mPerimeterCounts = null;

  @Override
  public Z next() {
    if (++mN > 0) {
      mPerimeterCounts = new long[2 * mN + 3];
      final Hunter h = new Hunter(Z2, true) {
        {
          setKeeper(animal -> ++mPerimeterCounts[animal.perimeterSize(Z2)]);
        }
      };
      h.count(mN);
      mS = RING.add(mS, RING.multiply(RING.substitute(Polynomial.create(mPerimeterCounts), C, Integer.MAX_VALUE), Z.valueOf(mN).square()).shift(mN));
    }
    return mS.coeff(mN);
  }
}
