package irvine.oeis.a126;
// Generated by gen_seq4.pl A126445/btrionk

import irvine.math.z.Z;

/**
 * A126455 Column 0 of triangle A126454; a(n) = C( C(n+2,3) + 2, n).
 * @author Georg Fischer
 */
public class A126455 extends A126454 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.triangleElement(mN, 0);
  }
}

