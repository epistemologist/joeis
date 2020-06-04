package irvine.oeis.a239;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A239140 Number of strict partitions of n having standard deviation \u03c3 <code>&lt; 1</code>.
 * @author Georg Fischer
 */
public class A239140 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A239140() {
    super(1, new long[] {0, -1, -2, -3, -2, -1, -1, -1},
      new long[] {-1, -1, 0, 1, 1});
  }
}
