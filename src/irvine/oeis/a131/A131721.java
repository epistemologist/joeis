package irvine.oeis.a131;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A131721 Overlay of Pell companion numbers: a(n)=A001333(n)+A001333(n-6).
 * @author Georg Fischer
 */
public class A131721 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A131721() {
    super(0, new long[] {-1, 1, 0, 0, 0, 0, -1, 1},
      new long[] {-1, 2, 1});
  }
}
