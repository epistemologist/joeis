package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037711 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,3,2,0</code>.
 * @author Sean A. Irvine
 */
public class A037711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037711() {
    super(new long[] {-6, 7, -7, 7}, new long[] {1, 9, 56, 336});
  }
}
