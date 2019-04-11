package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019316 Expansion of <code>1/((1-4x)(1-6x)(1-7x))</code>.
 * @author Sean A. Irvine
 */
public class A019316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019316() {
    super(new long[] {168, -94, 17}, new long[] {1, 17, 195});
  }
}
