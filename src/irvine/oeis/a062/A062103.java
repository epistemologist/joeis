package irvine.oeis.a062;

import irvine.math.LongUtils;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062103 Number of paths by which an unpromoted knight (keima) of Shogi can move to various squares on infinite board, if it starts from its origin square, the second leftmost square of the back rank.
 * @author Sean A. Irvine
 */
public class A062103 extends Sequence1 {

  private int mN = 0;

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int r, final int m) {
      if (m < 0 || r < 0 || m > r) {
        return Z.ZERO;
      }
      if (r == 1 && m == 0) {
        return Z.ONE;
      }
      return get(r - 3, m - 2).add(get(r - 1, m - 2));
    }
  };

  private int trinv(final int n) {
    return (int) ((LongUtils.sqrt(8L * n + 1) + 1) / 2);
  }

  @Override
  public Z next() {
    ++mN;
    return mB.get(trinv(mN - 1) - 1, (mN - ((trinv(mN - 1) * (trinv(mN - 1) - 1)) / 2)) - 1);
  }
}
