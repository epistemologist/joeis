package irvine.oeis.a100;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;

/**
 * A100904 Numbers n such that (10^n+1)^2-2 is prime.
 *
 * @author Georg Fischer
 */
public class A100904 extends BriefSequence {

  /** Construct the sequence. */
  public A100904() {
    super(1, BRIEF, new Z("22"), new Z("351"), new Z("1061"));
  }
}
