
package generico;

import jdk.jshell.execution.Util;

public class MethodUsage {
    
    Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
    Pair<Integer, String> p2 = new OrderedPair<>(2, "pear");
    boolean same = Method.compare(p1, p2);
   
}
