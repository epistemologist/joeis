package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217094 Least index k such that A011540(k) <code>&gt;= 10^n</code>.
 * @author Sean A. Irvine
 */
public class A217094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217094() {
    super(new long[] {90, -109, 20}, new long[] {2, 2, 11});
  }
}
