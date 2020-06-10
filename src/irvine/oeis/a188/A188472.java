package irvine.oeis.a188;
// Generated by gen_seq4.pl floor3 2020-06-09 22:00
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A188472 <code>a(n) = [6r]-[nr]-[6r-nr]</code>, where <code>r=(1+sqrt(5))/2</code> and <code>[]=floor</code>.
 * @author Georg Fischer
 */
public class A188472 implements Sequence {
  private long mN = 0;
  private static final CR R = CR.ONE.add((CR.FIVE).sqrt()).divide(CR.TWO);

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return CR.valueOf(6).multiply(R).floor().subtract(n.multiply(R).floor()).subtract(CR.valueOf(6).multiply(R).subtract(n.multiply(R)).floor());
  }
}
