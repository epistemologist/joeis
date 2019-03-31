package irvine.oeis.a019;

/**
 * A019593.
 * @author Sean A. Irvine
 */
public class A019593 extends A019592 {

  @Override
  protected long select(final long n, final long best) {
    return best + n;
  }
}
