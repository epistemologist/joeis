package irvine.oeis.a199;
// Generated by gen_seq4.pl eulerxfm 0 0 at 2020-09-17 12:15
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.EulerTransform;
import irvine.oeis.a002.A002859;


/**
 * A199118 Number of partitions of n into terms of (1,3)-Ulam sequence, cf. A002859.
 * @author Georg Fischer
 */
public class A199118 extends EulerTransform {

  /** Construct the sequence. */
  public A199118() {
    super(new CharacteristicFunction(new A002859()), 1);
  }
}
