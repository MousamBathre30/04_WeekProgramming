package juint;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {



    @Test
    @DisplayName("Test for the add elememt")
    void testAddElement(){
     int element = 5;
     ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
     ArrayList<Integer> expectedlist = new ArrayList<>(Arrays.asList(1,2,3,4,5));
     assertEquals(expectedlist,ListManager.addElement(list,element));

    }

    @Test
    @DisplayName("Test for the remove element")
    void testRemoveElement(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> expectedlist = new ArrayList<>(Arrays.asList(1,2,4));
        int index = 2;
        assertEquals(expectedlist,ListManager.removeElement(list,index));
    }

    @Test
    @DisplayName("Test for the get size")
    void testGetSize(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        assertEquals(4,ListManager.getSize(list));
    }
}