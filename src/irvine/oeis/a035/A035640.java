package irvine.oeis.a035;
// Generated by gen_seq4.pl partcond at 2020-09-17 10:00
// DO NOT EDIT here!

import irvine.math.z.Z;


/**
 * A035640 Number of partitions of n into parts 6k and 6k+4 with at least one part of each type.
 * @author Georg Fischer
 */
public class A035640 extends A035679 {

  /** Construct the sequence. */
  public A035640() {
    super(1, 6, 1, new int[] { 0, 4 });
  }
  
  protected Z total(final int[] cn) {
    return Z.valueOf(cn[0]).multiply(Z.valueOf(cn[1]));
  }
}
