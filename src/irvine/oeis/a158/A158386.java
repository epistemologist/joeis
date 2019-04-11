package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158386 <code>676n + 1</code>.
 * @author Sean A. Irvine
 */
public class A158386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158386() {
    super(new long[] {-1, 2}, new long[] {677, 1353});
  }
}
