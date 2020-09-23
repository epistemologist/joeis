package irvine.oeis.a113;
// Generated by gen_seq4.pl essent 0 A007677 at 2020-09-22 11:56
// DO NOT EDIT here!

import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007677;


/**
 * A113874 a(3n) = a(3n-1) + a(3n-2), a(3n+1) = 2n*a(3n) + a(3n-1), a(3n+2) = a(3n+1) + a(3n).
 * @author Georg Fischer
 */
public class A113874 extends PrependSequence {

  /** Construct the sequence. */
  public A113874() {
    super(new A007677(), 1, 0);
  }
}
