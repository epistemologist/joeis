package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156574 <code>a(n) = 34*a(n-1)-a(n-2)-4232</code> for <code>n &gt; 2</code>; <code>a(1)=1369, a(2)=42025</code>.
 * @author Sean A. Irvine
 */
public class A156574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156574() {
    super(new long[] {1, -35, 35}, new long[] {1369, 42025, 1423249});
  }
}
