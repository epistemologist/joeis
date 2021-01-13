package irvine.oeis.a054;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000120;


/**
 * A054868 Sum of bits of sum of bits of n: a(n) = wt(wt(n)).
 * Formula: <code>a(n) = A000120(A000120(n)).</code>
 * @author Georg Fischer
 */
public class A054868 extends NestedSequence {

  /** Construct the sequence. */
  public A054868() {
    super(0, new A000120(), new A000120(), 0, 0); 
  }

}