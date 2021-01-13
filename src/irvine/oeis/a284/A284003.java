package irvine.oeis.a284;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a006.A006068;
import irvine.oeis.a019.A019565;


/**
 * A284003 a(n) = A007913(A283477(n)) = A019565(A006068(n)).
 * Formula: <code>a(n) = A019565(A006068(n)).</code>
 * @author Georg Fischer
 */
public class A284003 extends NestedSequence {

  /** Construct the sequence. */
  public A284003() {
    super(0, new A019565(), new A006068(), 0, 0); 
  }

}