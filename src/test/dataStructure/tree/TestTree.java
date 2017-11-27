package test.dataStructure.tree;

import main.com.sshkim.dataStructure.tree.Tree;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sshkim on 2016. 12. 13..
 */
public class TestTree {

    @Test
    public void testTree(){

        Tree root = new Tree(0);

        Tree child_11 = new Tree(1);
        Tree child_12 = new Tree(2);
        Tree child_13 = new Tree(3);
        Tree child_14 = new Tree(4);

        root.addChild(child_11);
        root.addChild(child_12);
        root.addChild(child_13);
        child_14.setParent(root);

        Tree child_211 = new Tree(5);
        Tree child_212 = new Tree(6);
        Tree child_213 = new Tree(7);
        Tree child_221 = new Tree(8);
        Tree child_222 = new Tree(9);
        Tree child_231 = new Tree(10);

        child_11.addChild(child_211);
        child_11.addChild(child_212);
        child_11.addChild(child_213);

        child_12.addChild(child_221);
        child_12.addChild(child_222);

        child_13.addChild(child_231);

        Tree child_3111 = new Tree(11);
        Tree child_3112 = new Tree(12);
        Tree child_3113 = new Tree(13);
        Tree child_3121 = new Tree(14, child_212);

        child_3111.setParent(child_211);
        child_3112.setParent(child_211);
        child_3113.setParent(child_211);

        Assert.assertEquals(true, root.isRoot());
        Assert.assertNotEquals(true, child_11.isRoot());

        Assert.assertEquals(4, root.getChildren().size());
        Assert.assertEquals(child_212.hashCode(), child_3121.getParent().hashCode());
    }

}
