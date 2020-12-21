package irvine.oeis.a304;
// Generated by gen_seq4.pl genetf at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.GeneralizedEulerTransform;
import irvine.oeis.a000.A000009;


/**
 * A304783 Expansion of Product_{k&gt;=1} (1 - x^k)^q(k), where q(k) = number of partitions of k into distinct parts (A000009).
 * G.f.: <code>Product_{k&gt;=1} ((1-x^k)^A000009(k))</code>
 * @author Georg Fischer
 */
public class A304783 extends GeneralizedEulerTransform {

  /**
   * Construct the sequence.
   */
  public A304783() {
    super(0, 1);
    mSeqF = new A000009();
    mSeqF.next();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{mSeqF.next().negate()};
  }

}