package irvine.oeis.a082;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a006.A006530;
import irvine.oeis.a009.A009195;


/**
 * A082061 Greatest common prime-divisor of n and phi(n)=A000010(n); a(n)=1 if no common prime-divisor was found.
 * Formula: <code>a(n) = A006530(A009195(n)).</code>
 * @author Georg Fischer
 */
public class A082061 extends NestedSequence {

  /** Construct the sequence. */
  public A082061() {
    super(1, new A006530(), new A009195(), 1, 1); 
  }

}