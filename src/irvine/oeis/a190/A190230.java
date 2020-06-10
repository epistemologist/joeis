package irvine.oeis.a190;
// Generated by gen_seq4.pl floor3 2020-06-09 22:00
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A190230 <code>a(n) = [n*u + n*v] - [n*u] - [n*v]</code>, where <code>u=sin(2*Pi/5), v=cos(2*Pi/5)</code>, and <code>[]=floor</code>.
 * @author Georg Fischer
 */
public class A190230 implements Sequence {
  private long mN = 0;
  private static final CR U = CR.TWO.multiply(CR.PI).divide(CR.FIVE).sin();
  private static final CR V = CR.TWO.multiply(CR.PI).divide(CR.FIVE).cos();

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.multiply(U).add(n.multiply(V)).floor().subtract(n.multiply(U).floor()).subtract(n.multiply(V).floor());
  }
}
