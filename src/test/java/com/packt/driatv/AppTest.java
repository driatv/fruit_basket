package com.packt.driatv;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Check if we get the file content
     */
    @Test
    public void checkGetFileContent() throws Exception {
        List<String> list = App.getFileContent("input.txt");
        assertTrue(list.size() > 0);
    }

    /**
     * Check if the list of fruits is correctly map
     */
    @Test
    public void checkMapFile() throws Exception {
        List<Fruit> listFruits = App.mapFile(App.getFileContent("input.txt"));
        assertTrue(listFruits.get(0).getName().equals("Apple"));
        assertTrue(listFruits.get(0).getPrice() == 0.20);
        assertFalse(listFruits.get(1).getName().equals("Banana"));
    }

    /**
     * Check if the reduction of one of the fruit is correctly calculated
     */
    @Test
    public void checkGetPriceReduction() throws Exception {
        List<Fruit> listFruits = App.mapFile(App.getFileContent("input.txt"));
        assertTrue(listFruits.get(0).getPriceWithReduction() == 0.4);
    }
}
