package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A000992 "Half-Catalan numbers": <code>a(n) =</code> Sum_{k=1 ... <code>floor(n/2)}</code> a(k)a(n-k) with <code>a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A000992 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      add(Z.ZERO);
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final int lim = size() / 2;
    for (int k = 1, j = size() - 1; k <= lim; ++k, --j) {
      sum = sum.add(get(j).multiply(get(k)));
    }
    return sum;
  }
}

