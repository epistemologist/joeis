package irvine.oeis.a307;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 *
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A307061Test.class);
    suite.addTestSuite(A307102Test.class);
    suite.addTestSuite(A307177Test.class);
    suite.addTestSuite(A307179Test.class);
    suite.addTestSuite(A307182Test.class);
    suite.addTestSuite(A307345Test.class);
    suite.addTestSuite(A307628Test.class);
    suite.addTestSuite(A307670Test.class);
    suite.addTestSuite(A307687Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

