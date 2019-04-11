package irvine.oeis.a010;

import irvine.oeis.FiniteSequence;

/**
 * A010393 Squares <code>mod 32</code>.
 * @author Sean A. Irvine
 */
public class A010393 extends FiniteSequence {

  /**
   * Construct the sequence.
   */
  public A010393() {
    super(0, 1, 4, 9, 16, 17, 25);
  }
}
