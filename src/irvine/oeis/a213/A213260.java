package irvine.oeis.a213;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a016.A016897;


/**
 * A213260 p(5n+4) where p(k) = number of partitions of k = A000041(k).
 * Formula: <code>a(n) = A000041(A016897(n)).</code>
 * @author Georg Fischer
 */
public class A213260 extends NestedSequence {

  /** Construct the sequence. */
  public A213260() {
    super(0, new A000041(), new A016897(), 0, 0); 
  }

}