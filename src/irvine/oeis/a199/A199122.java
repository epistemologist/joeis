package irvine.oeis.a199;
// Generated by gen_seq4.pl eulerxfm 0 0 at 2020-09-17 12:15
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.EulerTransform;
import irvine.oeis.a001.A001857;


/**
 * A199122 Number of partitions of n into terms of (2,3)-Ulam sequence, cf. A001857.
 * @author Georg Fischer
 */
public class A199122 extends EulerTransform {

  /** Construct the sequence. */
  public A199122() {
    super(new CharacteristicFunction(new A001857()), 1);
  }
}
