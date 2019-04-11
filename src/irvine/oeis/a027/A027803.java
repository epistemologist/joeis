package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027803 <code>a(n) =</code> 35*(n+1)*binomial(n+4, <code>7)/4</code>.
 * @author Sean A. Irvine
 */
public class A027803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027803() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {35, 350, 1890, 7350, 23100, 62370, 150150, 330330, 675675});
  }
}
