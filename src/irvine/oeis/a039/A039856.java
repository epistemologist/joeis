package irvine.oeis.a039;
// Generated by gen_seq4.pl partcond at 2020-09-17 10:00
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a035.A035536;


/**
 * A039856 Number of partitions satisfying cn(1,5) + cn(4,5) &lt;= 1.
 * @author Georg Fischer
 */
public class A039856 extends A035536 {

  /** Construct the sequence. */
  public A039856() {
    super(1, 5, 1, new int[] {  });
  }
  
  protected Z total(final int[] cn) {
    return (cn[1] + cn[4] <= 1) ? Z.ONE : Z.ZERO;
  }
}
