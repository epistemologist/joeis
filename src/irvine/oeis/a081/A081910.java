package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081910 <code>4^n*(n^2-n+32)/32</code>.
 * @author Sean A. Irvine
 */
public class A081910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081910() {
    super(new long[] {64, -48, 12}, new long[] {1, 4, 17});
  }
}
