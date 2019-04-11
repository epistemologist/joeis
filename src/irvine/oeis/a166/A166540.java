package irvine.oeis.a166;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A166540 Number of ways to place 2 nonattacking kings on <code>an n</code> X n X n raumschach board.
 * @author Georg Fischer
 */
public class A166540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166540() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 193, 1548, 6714, 21280, 55395}, new long[] {0});
  }
}
