package irvine.oeis.a329;
// Generated by gen_seq4.pl diffseq at 2020-06-21 22:58
// DO NOT EDIT here!

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a051.A051924;

/**
 * A329533 First differences of <code>A051924</code>, or second differences of Central binomial coefficients <code>A000984</code>.
 * @author Georg Fischer
 */
public class A329533 extends DifferenceSequence {

  /** Construct the sequence. */
  public A329533() {
    super(new A051924());
  }
}
