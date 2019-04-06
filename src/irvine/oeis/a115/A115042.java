package irvine.oeis.a115;

import irvine.oeis.FiniteSequence;

/**
 * A115042 Positions of 1&apos;s in A094405, &quot;a(n) = sum of all previous terms modulo n, a(1)=1&quot;.
 * @author Georg Fischer
 */
public class A115042 extends FiniteSequence {

  /** Construct the sequence. */
  public A115042() {
    super(1, 2, 18, 24, 35, 40, 252);
  }
}
