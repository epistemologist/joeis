package irvine.oeis.a111;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000073;
import irvine.oeis.a066.A066178;


/**
 * A111430 Tribonacci(heptanacci(n)).
 * Formula: <code>a(n) = A000073(A066178(n)).</code>
 * @author Georg Fischer
 */
public class A111430 extends NestedSequence {

  /** Construct the sequence. */
  public A111430() {
    super(0, new A000073(), new A066178(), 0, 0); 
  }

}