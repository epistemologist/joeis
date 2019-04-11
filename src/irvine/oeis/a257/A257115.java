package irvine.oeis.a257;

import irvine.oeis.FiniteSequence;

/**
 * A257115 Smallest k such that none of k <code>+ 1,</code> k <code>+ 3,</code>... k <code>+ 2n - 1</code> are squarefree and all of k <code>+ 2,</code> k <code>+ 4,</code>... k <code>+ 2n</code> are squarefree.
 * @author Georg Fischer
 */
public class A257115 extends FiniteSequence {

  /** Construct the sequence. */
  public A257115() {
    super(1, 3, 15, 15, 49, 483, 5049, 6347, 144945);
  }
}
