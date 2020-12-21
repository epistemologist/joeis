package irvine.oeis.a308;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.GeneralizedEulerTransform;
import irvine.oeis.a008.A008480;


/**
 * A308272 G.f. A(x) satisfies: A(x) = (1 + x) * A(x^2)*A(x^3)*A(x^5)* ... *A(x^prime(k))* ...
 * G.f.: <code>Product_{k&gt;=1} ((1+x^k)^A008480(k))</code>
 * @author Georg Fischer
 */
public class A308272 extends GeneralizedEulerTransform {

  /**
   * Construct the sequence.
   */
  public A308272() {
    super(0, 1);
    mSeqF = new A008480();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{mSeqF.next().negate()};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

}