package irvine.oeis.a339;
// Generated by gen_seq4.pl holos at 2021-01-18 14:41
// 3: 3
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;


/**
 * A339850 Number of Hamiltonian circuits within parallelograms of size 3 X n on the triangular lattice.
 * @author Georg Fischer
 */
public class A339850 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A339850() {
    super(2, "[[0],[2],[4],[2],[-1]]", "1, 4, 13", 0);
  }
}