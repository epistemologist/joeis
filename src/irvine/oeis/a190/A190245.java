package irvine.oeis.a190;
// Generated by gen_seq4.pl floor3 2020-06-09 22:00
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A190245 <code>a(n) = [nu+nv]-[nu]-[nv]</code>, where <code>u=sqrt(2), v=2u</code>, and <code>[]=floor</code>.
 * @author Georg Fischer
 */
public class A190245 implements Sequence {
  private long mN = 0;
  private static final CR U = CR.SQRT2;
  private static final CR V = CR.TWO.multiply(U);

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.multiply(U).add(n.multiply(V)).floor().subtract(n.multiply(U).floor()).subtract(n.multiply(V).floor());
  }
}
