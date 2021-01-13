package irvine.oeis.a064;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a000.A000040;


/**
 * A064688 a(n) = number of partitions of primes into distinct (also odd) parts.
 * Formula: <code>a(n) = A000009(A000040(n)).</code>
 * @author Georg Fischer
 */
public class A064688 extends NestedSequence {

  /** Construct the sequence. */
  public A064688() {
    super(1, new A000009(), new A000040(), 0, 1); 
  }

}