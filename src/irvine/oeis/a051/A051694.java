package irvine.oeis.a051;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a001.A001602;


/**
 * A051694 Smallest Fibonacci number that is divisible by n-th prime.
 * Formula: <code>a(n) = A000045(A001602(n)).</code>
 * @author Georg Fischer
 */
public class A051694 extends NestedSequence {

  /** Construct the sequence. */
  public A051694() {
    super(1, new A000045(), new A001602(), 0, 1); 
  }

}