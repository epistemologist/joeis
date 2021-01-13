package irvine.oeis.a324;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a002.A002487;
import irvine.oeis.a006.A006068;


/**
 * A324337 a(n) = A002487(A006068(n)).
 * Formula: <code>a(n) = A002487(A006068(n)).</code>
 * @author Georg Fischer
 */
public class A324337 extends NestedSequence {

  /** Construct the sequence. */
  public A324337() {
    super(0, new A002487(), new A006068(), 0, 0); 
  }

}