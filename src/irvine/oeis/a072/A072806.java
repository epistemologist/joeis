package irvine.oeis.a072;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a007.A007091;
import irvine.oeis.a007.A007528;


/**
 * A072806 Primes of the form 6k+5 written in base 5.
 * Formula: <code>a(n) = A007091(A007528(n)).</code>
 * @author Georg Fischer
 */
public class A072806 extends NestedSequence {

  /** Construct the sequence. */
  public A072806() {
    super(1, new A007091(), new A007528(), 0, 1); 
  }

}