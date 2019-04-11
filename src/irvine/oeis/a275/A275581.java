package irvine.oeis.a275;

import irvine.oeis.FiniteSequence;

/**
 * A275581 Numbers n such that A010846(n) <code>&gt;= n/2</code>.
 * @author Georg Fischer
 */
public class A275581 extends FiniteSequence {

  /** Construct the sequence. */
  public A275581() {
    super(1, 2, 3, 4, 6, 8, 10, 12, 18, 30);
  }
}
