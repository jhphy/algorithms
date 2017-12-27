package com.algorithms.tree;

/**
 * Created by Jiang on 9/19/17.
 */

public class BinarySearchTree {

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int val) {
        root = insert(val, root);
    }

    public void remove(int val) {
        root = remove(val, root);
    }

    public int findMin() {
        return elementAt(findMin(root));
    }

    public int findMax() {
        return elementAt(findMax(root));
    }

    public int find(int val) {
        return elementAt(find(val, root));
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private int elementAt(BinaryNode t) {
        return t == null? null: t.element;
    }

    private void printTree() {
        if(isEmpty())
            System.out.println("Empty tree");
        else
            printTree(root);
    }

    private BinaryNode insert(int val, BinaryNode root) {
        if(root == null) {
            root = new BinaryNode(val);
        }
        else if(val < root.element){
            root.left = insert(val, root.left);
        }else if(val > root.element){
            root.right = insert(val, root.right);
        }else
            ;
        return root;
    }

    private BinaryNode remove(int val, BinaryNode root) {
        if(root == null) {
            return root;
        }
        if(root.element < val){
            root.right = remove(val, root.right);
        }else if(root.element > val){
            root.left = remove(val, root.left);
        }else if(root.left != null && root.right != null){
            root.element = findMin(root.right).element;
            root.right = remove(val, root.right);
        }else{
            root = root.right == null? root.left: root.right;
        }
        return root;
    }

    private BinaryNode findMin(BinaryNode root) {
        if(root == null)
            return null;
        else if(root.left == null)
            return root;
        return findMin(root.left);
    }

    private BinaryNode findMax(BinaryNode root) {
        if(root != null) {
            while (root.right != null)
                root = root.right;
        }
        return root;
    }

    private BinaryNode find(int val, BinaryNode root) {
        if(root == null) return null;
        if(root.element < val){
            return find(val, root.right);
        }else if(root.element > val) {
            return find(val, root.left);
        }else{
            return root;
        }
    }

    private void printTree(BinaryNode root) {
        if(root != null) {
            printTree(root.left);
            System.out.println(root.element);
            printTree(root.right);
        }
    }

    private BinaryNode root;

    public static void main( String [ ] args ) {

        BinarySearchTree t = new BinarySearchTree( );
        final int NUMS = 4000;
        final int GAP  =   37;

        System.out.println( "Checking... (no more output means success)" );

        for( int i = GAP; i != 0; i = ( i + GAP ) % NUMS )
            t.insert(i);

        for( int i = 1; i < NUMS; i+= 2 )
            t.remove(i);

        if( NUMS < 40 )
            t.printTree();
        if( ((t.findMin( ))) != 2 ||
                (t.findMax() != NUMS - 2 ))
            System.out.println( "FindMin or FindMax error!" );

        for( int i = 2; i < NUMS; i+=2 )
            if(t.find(i) != i)
                System.out.println( "Find error1!" );

//            for( int i = 1; i < NUMS; i+=2 )
//            {
//                if(t.find(i) != null)
//                    System.out.println( "Find error2!" );
//            }
    }

}