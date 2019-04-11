package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227138 Positive solutions of the Pell equation <code>x^2 -</code> 89*y^2 <code>= -1</code>. Solutions y <code>= 53*a(n)</code>.
 * @author Sean A. Irvine
 */
public class A227138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227138() {
    super(new long[] {-1, 1000002}, new long[] {1, 1000001});
  }
}
