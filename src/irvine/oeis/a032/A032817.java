package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032817 Numbers whose set of base 5 digits is <code>{1,4}</code>.
 * @author Sean A. Irvine
 */
public class A032817 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? get(n / 2 - 1).multiply(5).add(4)
      : get((n - 1) / 2).multiply(5).add(1);
  }
}
