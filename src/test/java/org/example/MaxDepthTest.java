package org.example;

import static org.example.MaxDepth.maxDepth;
import static org.junit.jupiter.api.Assertions.*;

class MaxDepthTest {

    @org.junit.jupiter.api.Test
    void TestMaxDepth() {
        TreeNode t = new TreeNode(2);
        int actual = maxDepth(t);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void TestMaxDepth2() {
        TreeNode t = new TreeNode(2);
        t.left = new TreeNode(6);
        int actual = maxDepth(t);;
        int expected = 2;
        assertEquals(expected, actual);
    }
}