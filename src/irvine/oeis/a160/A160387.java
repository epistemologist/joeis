package irvine.oeis.a160;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A160387 Decimal expansion of <code>4^5 *</code> Sum_{n&gt;=0} <code>1/4^(2^n)</code>.
 * @author Sean A. Irvine
 */
public class A160387 extends DecimalExpansionSequence {

  private static final CR CR45 = CR.valueOf(1024);

  private CR mSum = CR.ZERO;
  private int mK = -1;

  private void updateSum() {
    if (mK < 29) {
      mSum = mSum.add(CR.valueOf(Z.ONE.shiftLeft(2 << ++mK)).inverse());
    }
  }

  {
    for (int k = 0; k < 5; ++k) {
      updateSum();
    }
  }

  @Override
  protected CR getCR() {
    updateSum();
    return mSum.multiply(CR45);
  }
}
