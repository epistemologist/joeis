package irvine.oeis.a168;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a023.A023172;


/**
 * A168041 Fibonacci numbers that are divisible by their index.
 * Formula: <code>a(n) = A000045(A023172(n)).</code>
 * @author Georg Fischer
 */
public class A168041 extends NestedSequence {

  /** Construct the sequence. */
  public A168041() {
    super(1, new A000045(), new A023172(), 0, 1); 
  }

}