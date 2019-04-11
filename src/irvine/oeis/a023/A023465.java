package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023465 <code>n-23</code>.
 * @author Sean A. Irvine
 */
public class A023465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023465() {
    super(new long[] {-1, 2}, new long[] {-23, -22});
  }
}
