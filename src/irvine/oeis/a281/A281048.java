package irvine.oeis.a281;
// Generated by gen_seq4.pl diffseq at 2020-06-21 22:58
// DO NOT EDIT here!

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a005.A005590;

/**
 * A281048 Expansion of <code>x*(1 - x)*Product_{k&gt;=0} (1 + x^(2^k) - x^(2^(k+1)))</code>.
 * @author Georg Fischer
 */
public class A281048 extends DifferenceSequence {

  /** Construct the sequence. */
  public A281048() {
    super(new A005590());
  }
}
