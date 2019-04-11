package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141527 Expansion of <code>x*(x+2) / (41*x^2+x+1)</code>.
 * @author Sean A. Irvine
 */
public class A141527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141527() {
    super(new long[] {-41, -1}, new long[] {2, -1});
  }
}
