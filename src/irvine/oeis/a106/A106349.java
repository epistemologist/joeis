package irvine.oeis.a106;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a001.A001358;


/**
 * A106349 Primes indexed by semiprimes.
 * Formula: <code>a(n) = A000040(A001358(n)).</code>
 * @author Georg Fischer
 */
public class A106349 extends NestedSequence {

  /** Construct the sequence. */
  public A106349() {
    super(1, new A000040(), new A001358(), 1, 1); 
  }

}