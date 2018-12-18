package test;

import List.LinkedList;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList<Integer> ll=new LinkedList<>();

    

    @Test
    public void addEnd() {
        ll.addEnd(2);
        Assert.assertEquals(2, (long) ll.get(0));

    }

    @Test
    public void addStart() {
        ll.addStart(1);
        Assert.assertEquals(1,(long) ll.get(0));
    }

    @Test
    public void get() {
        ll.addStart(3);
        Assert.assertEquals(3, (long) ll.get(0));
    }

    @Test
    public void delete() {
        ll.addStart(1);
        ll.addEnd(2);
        ll.addEnd(3);
        ll.delete(1);
        Assert.assertEquals(2, (long) ll.get(1));

    }
}