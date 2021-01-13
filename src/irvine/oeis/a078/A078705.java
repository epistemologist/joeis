package irvine.oeis.a078;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000196;
import irvine.oeis.a000.A000203;


/**
 * A078705 Integer part of the square root of sigma(n).
 * Formula: <code>a(n) = A000196(A000203(n)).</code>
 * @author Georg Fischer
 */
public class A078705 extends NestedSequence {

  /** Construct the sequence. */
  public A078705() {
    super(1, new A000196(), new A000203(), 0, 1); 
  }

}