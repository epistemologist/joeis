package irvine.oeis.a074;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a010.A010872;


/**
 * A074941 a(n) = sigma(n) mod 3.
 * Formula: <code>a(n) = A010872(A000203(n)).</code>
 * @author Georg Fischer
 */
public class A074941 extends NestedSequence {

  /** Construct the sequence. */
  public A074941() {
    super(1, new A010872(), new A000203(), 0, 1); 
  }

}