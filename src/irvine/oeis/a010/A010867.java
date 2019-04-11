package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010867 Constant sequence: <code>a(n) = 28</code>.
 * @author Sean A. Irvine
 */
public class A010867 implements Sequence {

  private static final Z N = Z.valueOf(28);

  @Override
  public Z next() {
    return N;
  }
}

