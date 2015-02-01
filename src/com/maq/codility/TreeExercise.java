package com.maq.codility;

/**
 * Created by Marcelo on 01/02/2015.
 */
public class TreeExercise {

    public static void main(String[] args) {

        Tree tree = createTree();

    }


    /**
     *                       1
     *                               2
     *                5            9   3
     *              10   6               4
     *                    7
     *                      8
     *                        11
     *
     *
     * @return
     */
    private static Tree createTree() {

//        Tree root = new Tree(0)
        Tree node11 = new Tree(11, null, null);
        Tree node8 = new Tree(8, null, node11);
        Tree node7 = new Tree(7, null, node8);
        Tree node6 = new Tree(6, null, node7);

        Tree node10 = new Tree(10, null, null);

        Tree node5 = new Tree(5, node10, node6);


        Tree node4 = new Tree(4, null, null);
        Tree node3 = new Tree(3, null, node4);

        Tree node9 = new Tree(9, null, null);

        Tree node2 = new Tree(2, node9, node3);

        Tree root = new Tree(1, node5, node2);

        return root;
    }


}



class Tree {

    Tree(int x, Tree l, Tree r) {
        this.x = x;
        this.l = l;
        this.r = r;
    }

    public int x;
	public Tree l;
	public Tree r;
}
