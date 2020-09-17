package irvine.oeis.a035;
// Generated by gen_seq4.pl partcond at 2020-09-17 10:00
// DO NOT EDIT here!

import irvine.math.z.Z;


/**
 * A035680 Number of partitions of n into parts 8k+1 and 8k+3 with at least one part of each type.
 * @author Georg Fischer
 */
public class A035680 extends A035679 {

  /** Construct the sequence. */
  public A035680() {
    super(1, 8, 1, new int[] { 1, 3 });
  }
  
  protected Z total(final int[] cn) {
    return Z.valueOf(cn[0]).multiply(Z.valueOf(cn[1]));
  }
}
