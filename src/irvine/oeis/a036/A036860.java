package irvine.oeis.a036;
// Generated by gen_seq4.pl partcond at 2020-09-17 10:00
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a035.A035536;


/**
 * A036860 Number of partitions of n such that cn(0,5) = cn(2,5) &lt; cn(1,5) &lt; cn(3,5) = cn(4,5).
 * @author Georg Fischer
 */
public class A036860 extends A035536 {

  /** Construct the sequence. */
  public A036860() {
    super(1, 5, 1, new int[] {  });
  }
  
  protected Z total(final int[] cn) {
    return (cn[0] == cn[2] && cn[2] < cn[1] && cn[1] < cn[3] && cn[3] == cn[4]) ? Z.ONE : Z.ZERO;
  }
}
