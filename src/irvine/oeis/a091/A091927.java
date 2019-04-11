package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091927 Expansion of <code>(1-6x)/(1-6x-5x^2)</code>.
 * @author Sean A. Irvine
 */
public class A091927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091927() {
    super(new long[] {5, 6}, new long[] {1, 0});
  }
}
