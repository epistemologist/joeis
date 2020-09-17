package irvine.oeis.a035;
// Generated by gen_seq4.pl partcond at 2020-09-17 10:00
// DO NOT EDIT here!

import irvine.math.z.Z;


/**
 * A035622 Number of partitions of n into parts 4k and 4k+2 with at least one part of each type.
 * @author Georg Fischer
 */
public class A035622 extends A035679 {

  /** Construct the sequence. */
  public A035622() {
    super(0, 4, 1, new int[] { 0, 2 });
  }
  
  protected Z total(final int[] cn) {
    return Z.valueOf(cn[0]).multiply(Z.valueOf(cn[1]));
  }
}
