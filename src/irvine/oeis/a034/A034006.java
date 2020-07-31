package irvine.oeis.a034;

import irvine.oeis.a010.A010575;

/**
 * A034006 Number of <code>n-step self-avoiding</code> walks on the 4-dimensional hypercubic lattice with no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class A034006 extends A010575 {

  @Override
  protected boolean check(final int point, final int n) {
    if (!super.check(point, n)) {
      return false;
    }
    int neighbourCount = -1;
    for (final int delta : DELTAS) {
      final int newPoint = point + delta;
      if (contains(newPoint, n) && ++neighbourCount > 0) {
        return false;
      }
    }
    return true;
  }
}
