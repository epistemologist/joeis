package irvine.oeis.a286;
// Generated by gen_seq4.pl eulerxfm 0 0 at 2020-09-17 12:15
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.EulerTransform;
import irvine.oeis.a028.A028260;


/**
 * A286219 Number of partitions of n into parts with an even number of prime divisors (counted with multiplicity).
 * @author Georg Fischer
 */
public class A286219 extends EulerTransform {

  /** Construct the sequence. */
  public A286219() {
    super(new CharacteristicFunction(new A028260()), 1);
  }
}
