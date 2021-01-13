package irvine.oeis.a069;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a006.A006093;
import irvine.oeis.a007.A007913;


/**
 * A069114 Squarefree part of prime(n)-1 : the smallest number such that a(n)*(prime(n)-1) is a square.
 * Formula: <code>a(n) = A007913(A006093(n)).</code>
 * @author Georg Fischer
 */
public class A069114 extends NestedSequence {

  /** Construct the sequence. */
  public A069114() {
    super(1, new A007913(), new A006093(), 1, 1); 
  }

}