package irvine.oeis.a035;
// Generated by gen_seq4.pl partcond at 2020-09-17 10:00
// DO NOT EDIT here!

import irvine.math.z.Z;


/**
 * A035675 Number of partitions of n into parts 8k and 8k+4 with at least one part of each type.
 * @author Georg Fischer
 */
public class A035675 extends A035679 {

  /** Construct the sequence. */
  public A035675() {
    super(1, 8, 1, new int[] { 0, 4 });
  }
  
  protected Z total(final int[] cn) {
    return Z.valueOf(cn[0]).multiply(Z.valueOf(cn[1]));
  }
}
