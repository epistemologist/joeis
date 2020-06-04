package irvine.oeis.a091;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A091770 Poincar\u00e9 series [or Poincare series] (or Molien series) for <code>H^*(GL_4(F_2))</code>.
 * @author Georg Fischer
 */
public class A091770 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A091770() {
    super(0, new long[] {1, 0, 1, 1, 1, 2, 2, 3, 2, 0, -1, 1, 0, 0, 0, 0, 1},
      new long[] {1, 0, 0, -1, -1, 0, -1, 0, 0, 1, 2, 1, 0, 0, -1, 0, -1, -1, 
      0, 0, 1});
  }
}
