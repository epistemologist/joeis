package irvine.oeis.a339;
// Generated by gen_seq4.pl holos at 2021-01-18 14:41
// 4: 4
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;


/**
 * A339487 a(n) is the area of the n-gon with vertices (3^i, 5^i) for 0 &lt;= i &lt;= n-1.
 * @author Georg Fischer
 */
public class A339487 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A339487() {
    super(3, "[[0],[-225],[360],[-158],[24],[-1]]", "8, 192, 3344, 52800", 0);
  }
}