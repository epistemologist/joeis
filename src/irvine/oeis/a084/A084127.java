package irvine.oeis.a084;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a001.A001358;
import irvine.oeis.a006.A006530;


/**
 * A084127 Prime factor &gt;= other prime factor of n-th semiprime.
 * Formula: <code>a(n) = A006530(A001358(n)).</code>
 * @author Georg Fischer
 */
public class A084127 extends NestedSequence {

  /** Construct the sequence. */
  public A084127() {
    super(1, new A006530(), new A001358(), 1, 1); 
  }

}