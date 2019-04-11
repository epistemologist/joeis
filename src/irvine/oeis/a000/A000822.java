package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000822 Expansion of (sin^2 <code>x +</code> sin <code>x )</code> /cos <code>2x</code>.
 * @author Sean A. Irvine
 */
public class A000822 implements Sequence {

  private boolean mSource = false;
  private final Sequence mA = new A000464();
  private final Sequence mB = new A000816();

  @Override
  public Z next() {
    mSource = !mSource;
    return mSource ? mB.next() : mA.next();
  }
}
