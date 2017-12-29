package com.algorithms.tree;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void bottomUp() {
        MaximumDepthOfBinaryTree d = new MaximumDepthOfBinaryTree();
        BinaryNode node = new BinaryNode(1);
        node.left = new BinaryNode(1);
        node.left.right = new BinaryNode(1);
        assertEquals(3, d.bottomUp(node));
    }

    @Test
    void topDown() {
        MaximumDepthOfBinaryTree d = new MaximumDepthOfBinaryTree();
        BinaryNode node = new BinaryNode(1);
        node.left = new BinaryNode(1);
        node.left.right = new BinaryNode(1);
        assertEquals(3, d.topDown(node));
    }
}