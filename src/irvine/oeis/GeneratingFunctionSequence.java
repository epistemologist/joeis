package irvine.oeis;

import java.util.Arrays;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * An ordinary generating function consisting of a fraction of two polynomials in "x".
 * @author Georg Fischer
 */
public class GeneratingFunctionSequence implements Sequence {

  protected Z[] mNum; // coefficients of the numerator   polynomial, index is the exponent
  protected Z[] mDen; // coefficients of the denominator polynomial

  protected GeneratingFunctionSequence() { }

  /**
   * Construct a new rational integer polynomial generating function sequence.
   * @param num numerator
   * @param den denominator
   */
  public GeneratingFunctionSequence(final Z[] num, final Z[] den) {
    mNum = Arrays.copyOf(num, num.length); // copy because this class is destructive
    mDen = Arrays.copyOf(den, den.length);
  }

  /**
   * Construct the specified generating function.
   * @param num coefficients of the numerator   polynomial
   * @param den coefficients of the denominator polynomial
   */
  public GeneratingFunctionSequence(final long[] num, final long[] den) {
    this(ZUtils.toZ(num), ZUtils.toZ(den));
  }

  /**
   * Construct a new rational integer polynomial generating function sequence.
   * @param num numerator
   * @param den denominator
   */
  public GeneratingFunctionSequence(final Polynomial<Z> num, final Polynomial<Z> den) {
    this(num.toArray(new Z[num.size()]), den.toArray(new Z[den.size()]));
  }

  @Override
  public Z next() {
    final Z divisor = mDen[0];
    if (divisor.equals(Z.ZERO)) {
      throw new IllegalArgumentException("divisor is zero");
    }
    final Z[] quotRest = mNum[0].divideAndRemainder(divisor);
    final Z result = quotRest[0];
    if (!quotRest[1].equals(Z.ZERO)) {
      throw new IllegalArgumentException("no even division");
    }
    final Z quotient = result.negate();
    final int len1 = Math.max(mNum.length, mDen.length);
    final int len2 = mDen.length;
    final Z[] vect1 = new Z[len1 - 1]; // will replace 'mNum' in the end
    int iterm = 1; // the first term of vect1 becomes ZERO and is skipped
    while (iterm < len1) {
      Z term = Z.ZERO;
      if (iterm < len2) {
        term = mDen[iterm].multiply(quotient);
      }
      if (iterm < mNum.length) {
        term = term.add(mNum[iterm]);
      }
      vect1[iterm - 1] = term;
      ++iterm;
    } // while iterm
    mNum = vect1;
    return result;
  }
}
