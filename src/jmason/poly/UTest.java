package jmason.poly;

import java.util.HashSet;

/**
 * An object allowing testing of strings, coordinate pairs or coordinate triples, for uniqueness.
 * @author jmason
 */
public class UTest extends HashSet<String> {

  public boolean put(final int x, final int y) {
    return add(prepare(x, y));
  }

  public boolean put(final int x, final int y, final int z) {
    return add(prepare(x, y, z));
  }

  public boolean isIn(final int x, final int y) {
    return contains(prepare(x, y));
  }

  public boolean isIn(final int x, final int y, final int z) {
    return contains(prepare(x, y, z));
  }

  private String prepare(final int x, final int y) {
    return x + " " + y;
  }

  private String prepare(final int x, final int y, final int z) {
    return x + " " + y + " " + z;
  }
}
