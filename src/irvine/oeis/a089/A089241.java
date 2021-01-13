package irvine.oeis.a089;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a029.A029933;


/**
 * A089241 Even numbers k such that k/2 - 1 is prime.
 * Formula: <code>a(n) = A029933(A000040(n)).</code>
 * @author Georg Fischer
 */
public class A089241 extends NestedSequence {

  /** Construct the sequence. */
  public A089241() {
    super(1, new A029933(), new A000040(), 1, 1); 
  }

}