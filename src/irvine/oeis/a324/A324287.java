package irvine.oeis.a324;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a002.A002487;
import irvine.oeis.a005.A005187;


/**
 * A324287 a(n) = A002487(A005187(n)).
 * Formula: <code>a(n) = A002487(A005187(n)).</code>
 * @author Georg Fischer
 */
public class A324287 extends NestedSequence {

  /** Construct the sequence. */
  public A324287() {
    super(0, new A002487(), new A005187(), 0, 0); 
  }

}