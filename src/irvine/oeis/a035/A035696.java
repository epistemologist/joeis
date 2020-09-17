package irvine.oeis.a035;
// Generated by gen_seq4.pl partcond at 2020-09-17 10:00
// DO NOT EDIT here!

import irvine.math.z.Z;


/**
 * A035696 Number of partitions of n into parts 8k+4 and 8k+7 with at least one part of each type.
 * @author Georg Fischer
 */
public class A035696 extends A035679 {

  /** Construct the sequence. */
  public A035696() {
    super(1, 8, 1, new int[] { 4, 7 });
  }
  
  protected Z total(final int[] cn) {
    return Z.valueOf(cn[0]).multiply(Z.valueOf(cn[1]));
  }
}
