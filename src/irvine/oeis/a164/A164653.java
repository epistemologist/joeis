package irvine.oeis.a164;
// Generated by gen_seq4.pl essent 1 A001043 at 2020-09-22 11:56
// DO NOT EDIT here!

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001043;


/**
 * A164653 a(1) = 1, for n>=2: a(n) = sum of two consecutive noncomposite numbers A008578.
 * @author Georg Fischer
 */
public class A164653 extends PrependSequence {

  /** Construct the sequence. */
  public A164653() {
    super(new A001043(), 1, 3);
  }
}
