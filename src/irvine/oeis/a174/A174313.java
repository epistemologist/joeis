package irvine.oeis.a174;

import irvine.oeis.a001.A001334;

/**
 * A174313 Number of n-step walks on hexagonal lattice (no points repeated, no adjacent points unless consecutive in path).
 * @author Sean A. Irvine
 */
public class A174313 extends A001334 {

  @Override
  protected boolean check(final int point, final int n) {
    if (!super.check(point, n)) {
      return false;
    }
    int neighbourCount = - 1; // -1 for where we are coming from
    for (final int delta : DELTAS) {
      final int newPoint = point + delta;
      if (contains(newPoint, n) && ++neighbourCount > 0) {
        return false;
      }
    }
    return true;
  }
}
