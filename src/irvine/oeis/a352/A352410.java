package irvine.oeis.a352;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A352410 Expansion e.g.f. LambertW( -x/(1-x) ) / (-x).
 * @author Georg Fischer
 */
public class A352410 extends LambdaSequence {

  /** Construct the sequence. */
  public A352410() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Z.valueOf(k + 1)).pow(k - 1).multiply(Binomial.binomial(n, k)).divide(MemoryFactorial.SINGLETON.factorial(k))).multiply(MemoryFactorial.SINGLETON.factorial(n)).num());
  }
}
