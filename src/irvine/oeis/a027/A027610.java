package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a047.A047749;

/**
 * A027610 Number of chordal planar triangulations; also number of planar triangulations with maximal number of triangles; also number of graphs obtained from the tetrahedron by repeatedly inserting vertices of degree 3 into a triangular face; also number of uniquely 4-colorable planar graphs; also number of simplicial 3-clusters with n cells; also Apollonian networks.
 * @author Sean A. Irvine
 */
public class A027610 extends A047749 {

  /** Construct the sequence. */
  public A027610() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    Z res = a1764(++mN).multiply2().divide(mN + 1).add(a47749(mN).multiply(9));
    if ((mN & 1) == 0) {
      res = res.add(a1764(mN / 2).multiply(5));
    }
    if ((mN - 1) % 3 == 0) {
      res = res.add(a1764((mN - 1) / 3).multiply(8));
    }
    if ((mN - 1) % 4 == 0) {
      res = res.add(a1764((mN - 1) / 4).multiply(6));
    }
    if ((mN - 2) % 6 == 0) {
      res = res.add(a1764((mN - 2) / 6).multiply(4));
    }
    if ((2 * mN - 1) % 3 == 0) {
      res = res.add(a47749((2 * mN - 1) / 3).multiply(4));
    }
    return res.divide(24);
  }
}
