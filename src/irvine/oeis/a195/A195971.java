package irvine.oeis.a195;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A195971 Number of n X 1 0..4 arrays with each element x equal to the number its horizontal and vertical neighbors equal to 2,0,1,3,4 for x=0,1,2,3,4.
 * @author Georg Fischer
 */
public class A195971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195971() {
    super(new long[] {1, 1, 0, 1}, new long[] {1, 3, 4, 5}, new long[] {0});
  }
}
