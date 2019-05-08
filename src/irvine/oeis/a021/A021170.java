package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021170.
 * @author Sean A. Irvine
 */
public class A021170 extends PrependSequence {

  /** Construct the sequence. */
  public A021170() {
    super(new PeriodicSequence(0, 6, 0, 2, 4, 0, 9, 6, 3, 8, 5, 5, 4, 2, 1, 6, 8, 6, 7, 4, 6, 9, 8, 7, 9, 5, 1, 8, 0, 7, 2, 2, 8, 9, 1, 5, 6, 6, 2, 6, 5), 0);
  }
}
