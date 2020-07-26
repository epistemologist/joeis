package irvine.oeis.a036;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A036291 <code>a(n) = n*5^n</code>.
 * @author Georg Fischer
 */
public class A036291 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A036291() {
    super(0, new long[] {0, 5},
      new long[] {1, -10, 25});
  }
}
