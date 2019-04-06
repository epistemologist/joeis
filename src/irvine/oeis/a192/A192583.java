package irvine.oeis.a192;

import irvine.oeis.FiniteSequence;

/**
 * A192583 Monotonic ordering of set S generated by these rules: if x and y are in S and xy+1 is a prime, then xy+1 is in S, and 2, 4, 6, and 8 are in S.
 * @author Georg Fischer
 */
public class A192583 extends FiniteSequence {

  /** Construct the sequence. */
  public A192583() {
    super(2, 4, 5, 6, 8, 11, 13, 17, 23, 31, 37, 41, 47, 53, 67, 79, 83, 89, 103, 107, 137, 139, 149, 167, 179, 223, 269, 283, 317, 359, 499, 557, 619, 643, 719, 823, 857, 1097, 1193, 1433, 1439, 1699, 1997, 2153, 2477, 2879, 3343, 4457, 6857, 7159, 8599, 12919, 41143);
  }
}
