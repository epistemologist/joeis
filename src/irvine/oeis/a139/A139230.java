package irvine.oeis.a139;
// Generated by gen_seq4.pl diffseq at 2020-06-21 22:58
// DO NOT EDIT here!

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000396;

/**
 * A139230 Second differences of perfect numbers <code>A000396</code>.
 * @author Georg Fischer
 */
public class A139230 extends DifferenceSequence {

  /** Construct the sequence. */
  public A139230() {
    super(new DifferenceSequence(new A000396()));
  }
}
