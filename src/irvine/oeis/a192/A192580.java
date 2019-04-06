package irvine.oeis.a192;

import irvine.oeis.FiniteSequence;

/**
 * A192580 Monotonic ordering of set S generated by these rules: if x and y are in S and xy+1 is a prime, then xy+1 is in S, and 2 is in S.
 * @author Georg Fischer
 */
public class A192580 extends FiniteSequence {

  /** Construct the sequence. */
  public A192580() {
    super(2, 5, 11, 23, 47);
  }
}
