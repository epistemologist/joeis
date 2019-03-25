package irvine.oeis.a155;

import irvine.math.z.Z;

/**
 * A155508.
 * @author Sean A. Irvine
 */
public class A155508 extends A155507 {

  @Override
  public Z next() {
    while (true) {
      final String s = step();
      final Z n = new Z(s);
      if (n.isPrime()) {
        final Z t = new Z(new StringBuilder(s).reverse());
        if (n.compareTo(t) < 0 && t.isProbablePrime()) {
          return n;
        }
      }
    }
  }
}

