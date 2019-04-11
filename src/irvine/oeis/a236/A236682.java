package irvine.oeis.a236;

import irvine.oeis.FiniteSequence;

/**
 * A236682 Values of a for triples <code>(a</code>,b,c) of positive integers such that <code>1/a +</code> 1/b + 1/c <code>= 1/2</code> and <code>a &lt;=</code> b <code>&lt;=</code> c, listed with multiplicity.
 * @author Georg Fischer
 */
public class A236682 extends FiniteSequence {

  /** Construct the sequence. */
  public A236682() {
    super(3, 3, 3, 3, 3, 4, 4, 4, 5, 6);
  }
}
