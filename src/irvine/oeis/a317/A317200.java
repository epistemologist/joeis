package irvine.oeis.a317;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A317200 G.f.: -x*(2*x^3+2*x^2+x-2)/(x^4-2*x+1).
 * @author Georg Fischer
 */
public class A317200 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A317200() {
    super(new long[] {0, 2, -1, -2, -2}, new long[] {1, -2, 0, 0, 1});
  }
}
