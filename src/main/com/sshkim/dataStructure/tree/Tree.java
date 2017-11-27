package main.com.sshkim.dataStructure.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sshkim on 2016. 12. 13..
 */
public class Tree {

    private int data;
    private Tree parent;
    private List<Tree> children = new ArrayList<>();;

    public Tree(int data) {
        this.data = data;
    }

    public Tree(int data, Tree parent) {
        this.data = data;
        this.parent = parent;
    }

    public void addChild(Tree child){
        child.parent = this;
        children.add(child);
    }

    public List<Tree> getChildren() {
        return children;
    }

    public void setParent(Tree parent) {
        parent.addChild(this);
    }

    public Tree getParent() {
        return parent;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isRoot(){
        return parent == null;
    }

    public boolean isLeaf(){
        return children.size() == 0;
    }

    public void removeParent(){
        this.parent = null;
    }
}
