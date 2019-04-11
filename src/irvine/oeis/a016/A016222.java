package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016222 Expansion of <code>1/((1-x)(1-4x)(1-6x))</code>.
 * @author Sean A. Irvine
 */
public class A016222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016222() {
    super(new long[] {24, -34, 11}, new long[] {1, 11, 87});
  }
}
