package irvine.oeis.a035;
// Generated by gen_seq4.pl partcond at 2020-09-17 10:00
// DO NOT EDIT here!

import irvine.math.z.Z;


/**
 * A035563 Number of partitions of n with equal nonzero number of parts congruent to each of 0 and 2 (mod 5).
 * @author Georg Fischer
 */
public class A035563 extends A035536 {

  /** Construct the sequence. */
  public A035563() {
    super(0, 5, 1, new int[] { 0, 2 });
  }
  
  protected Z total(final int[] cn) {
    return (cn[0] == cn[1] &&  cn[0] >= 1) ? Z.ONE : Z.ZERO;
  }
}
