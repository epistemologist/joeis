package irvine.oeis.a067;
// Generated by gen_seq4.pl eulerxfm 0 0 at 2020-09-17 12:15
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.EulerTransform;
import irvine.oeis.a000.A000069;


/**
 * A067590 Number of partitions of n into odious numbers (A000069).
 * @author Georg Fischer
 */
public class A067590 extends EulerTransform {

  /** Construct the sequence. */
  public A067590() {
    super(new CharacteristicFunction(1, new A000069(), true, 4), 1);
  }
}
