package irvine.oeis.a130;
// Generated by gen_seq4.pl A101688/parmof2 at 2023-08-27 14:11

import irvine.oeis.a000.A000217;
import irvine.oeis.a101.A101688;

/**
 * A130541 Duplicate of A128489.
 * @author Georg Fischer
 */
public class A130541 extends A101688 {

  /** Construct the sequence. */
  public A130541() {
    super(1, new A000217().skip(1));
  }
}
