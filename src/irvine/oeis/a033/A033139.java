package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033139 Base 3 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,0,0</code>.
 * @author Sean A. Irvine
 */
public class A033139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033139() {
    super(new long[] {-3, 1, 0, 3}, new long[] {1, 3, 9, 28});
  }
}
