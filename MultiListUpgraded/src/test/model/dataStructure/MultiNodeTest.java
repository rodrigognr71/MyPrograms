package model.dataStructure;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiNodeTest {

    @Test
    public void getChildren() {
    }

    @Test
    public void setChildren() {
    }

    @Test
    public void equals() {
        MultiNode<String,String> multiNode = new MultiNode<>("v2");
        MultiNode<String,String> multiNode2 = new MultiNode<>("v1");
        assertTrue(multiNode.equals(multiNode2));

    }
}