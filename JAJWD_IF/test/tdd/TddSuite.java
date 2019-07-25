/*
 * Unitary test suite for package tdd
 */
package tdd;

import java.util.LinkedList;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Unitary test suite for package tdd
 * @author gheor
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({tdd.ShapeTest.class, tdd.TriangleTest.class, tdd.SquareTest.class, tdd.CircleTest.class, tdd.RectangleTest.class, tdd.TestShapesDefinitionTest.class})
public class TddSuite {
    
}
