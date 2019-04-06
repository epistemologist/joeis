package irvine.oeis.a113;

import irvine.oeis.FiniteSequence;

/**
 * A113164 a(n) = (6 choose n) * (6 choose 6-n).
 * @author Georg Fischer
 */
public class A113164 extends FiniteSequence {

  /** Construct the sequence. */
  public A113164() {
    super(1, 36, 225, 400, 225, 36, 1);
  }
}
