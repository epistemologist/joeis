package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187506 Let i be in <code>{1,2,3,4}</code> and let r <code>&gt;= 0</code> be <code>an</code> integer. Let p = {p_1, p_2, p_3, p_4} <code>= {-1,0,1,2},</code> n=3*r+p_i, and define <code>a(-1)=0</code>. Then a(n)=a(3*r+p_i) gives the quantity of H_(9,4,0) tiles in a subdivided H_(9,i,r) tile after linear scaling by the factor Q^r, where Q=sqrt(x^3-2*x) with x=2*cos(Pi/9).
 * @author Sean A. Irvine
 */
public class A187506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187506() {
    super(new long[] {-1, 1, -1, 0, 0, 0, 3, -3, 3, -1, 1}, new long[] {0, 0, 1, 1, 1, 1, 2, 3, 4, 7, 9});
  }
}
