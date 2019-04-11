package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016981 Expansion of <code>1/((1-3x)(1-4x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A016981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016981() {
    super(new long[] {120, -82, 17}, new long[] {1, 17, 207});
  }
}
