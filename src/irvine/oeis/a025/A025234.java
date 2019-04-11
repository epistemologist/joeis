package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025234 An L-tile is <code>a 2</code> X 2 square with the upper 1 X 1 subsquare removed; no rotations are allowed. <code>a(n) =</code> number of tilings of <code>a 4</code> X n rectangle using tiles that are either 1 X 1 squares or L-tiles.
 * @author Sean A. Irvine
 */
public class A025234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025234() {
    super(new long[] {-1, 0, 4, 5, 1}, new long[] {1, 0, 4, 8, 28});
  }
}
