package irvine.oeis.a123;
// Generated by gen_seq4.pl essent 1 A016052 at 2020-09-22 11:56
// DO NOT EDIT here!

import irvine.oeis.PrependSequence;
import irvine.oeis.a016.A016052;


/**
 * A123171 a(1) = 123, a(n) = sum of digits of all previous terms.
 * @author Georg Fischer
 */
public class A123171 extends PrependSequence {

  /** Construct the sequence. */
  public A123171() {
    super(1, new A016052(), 123);
  }
}
