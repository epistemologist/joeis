package irvine.oeis.a038;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000225;
import irvine.oeis.a001.A001511;


/**
 * A038712 Let k be the exponent of highest power of 2 dividing n (A007814); a(n) = 2^(k+1)-1.
 * Formula: <code>a(n) = A000225(A001511(n)).</code>
 * @author Georg Fischer
 */
public class A038712 extends NestedSequence {

  /** Construct the sequence. */
  public A038712() {
    super(1, new A000225(), new A001511(), 0, 1); 
  }

}