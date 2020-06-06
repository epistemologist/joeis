package irvine.oeis.a092;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A092236 <code>a(n) = (3^n + 2*3^(n/2)*cos(n*Pi/6))/3</code>.
 * @author Georg Fischer
 */
public class A092236 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A092236() {
    super(0, new long[] {1, -4, 4},
      new long[] {1, -6, 12, -9});
  }
}
