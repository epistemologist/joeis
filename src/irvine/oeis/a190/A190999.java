package irvine.oeis.a190;
// Generated by gen_seq4.pl diffseq at 2020-06-21 22:58
// DO NOT EDIT here!

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a002.A002416;

/**
 * A190999 <code>a(n) = 2^(n^2)*(2^(2*n+1) - 1)</code>.
 * @author Georg Fischer
 */
public class A190999 extends DifferenceSequence {

  /** Construct the sequence. */
  public A190999() {
    super(new A002416());
  }
}
