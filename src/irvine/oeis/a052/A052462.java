package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052462 <code>a(n)</code> is the minimal positive integral solution k to <code>24*k == 1 (mod 5^n)</code>.
 * @author Sean A. Irvine
 */
public class A052462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052462() {
    super(new long[] {-25, 25, 1}, new long[] {4, 24, 99});
  }
}
