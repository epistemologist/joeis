package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212968 Number of (w,x,y) with all terms in <code>{0,</code>...,n} and w&gt;=range{w,x,y}.
 * @author Sean A. Irvine
 */
public class A212968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212968() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 5, 17, 38, 75, 127});
  }
}
