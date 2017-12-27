package com.algorithms.tree;

/**
 * Created by Jiang Huang on 9/19/17.
 */

public class BinaryNode {
    BinaryNode(int element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }

    BinaryNode(int element, BinaryNode left, BinaryNode right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    int element;
    BinaryNode left;
    BinaryNode right;
}