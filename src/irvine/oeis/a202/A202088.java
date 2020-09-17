package irvine.oeis.a202;
// Generated by gen_seq4.pl partcond at 2020-09-17 10:00
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a035.A035536;


/**
 * A202088 Number of partitions of 5n such that cn(0, 5) < cn(1, 5) = cn(4, 5) = cn(2, 5) = cn(3, 5).
 * @author Georg Fischer
 */
public class A202088 extends A035536 {

  /** Construct the sequence. */
  public A202088() {
    super(0, 5, 5, new int[] {  });
  }
  
  protected Z total(final int[] cn) {
    return (cn[0] < cn[1] && cn[1] == cn[4] && cn[4] == cn[2] && cn[2] == cn[3]) ? Z.ONE : Z.ZERO;
  }
}
