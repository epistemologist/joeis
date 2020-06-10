package irvine.oeis.a190;
// Generated by gen_seq4.pl floor3 2020-06-09 22:00
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A190242 <code>a(n) = [n*u+n*v]-[n*u]-[n*v]</code>, where <code>u=sqrt(2), v=sqrt(3)</code>, and <code>[]=floor</code>.
 * @author Georg Fischer
 */
public class A190242 implements Sequence {
  private long mN = 0;
  private static final CR U = CR.SQRT2;
  private static final CR V = CR.THREE.sqrt();

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.multiply(U).add(n.multiply(V)).floor().subtract(n.multiply(U).floor()).subtract(n.multiply(V).floor());
  }
}
