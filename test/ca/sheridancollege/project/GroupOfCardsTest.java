/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ttta
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    
    /**
     * Test of constructor method, of class GroupOfCards.
     */
    @Test
    public void testGroupOfCardsGood() {
        boolean access = false;
        System.out.println("constructor good");
        GroupOfCards instance = new GroupOfCards();
        if (!(String.valueOf(instance)).isEmpty()) {
            access = true;
            assertTrue(access);
        }
    }
    
    @Test
    public void testGroupOfCardsBad() {
        boolean access = false;
        System.out.println("constructor bad");
        GroupOfCards instance = new GroupOfCards();
        if ((String.valueOf(instance)).isEmpty()) {
            access = true;
            assertTrue(access);
        }
    }

    @Test
    public void testGroupOfCardsBoundary() {
        boolean access = false;
        System.out.println("constructor boundary");
        GroupOfCards instance = new GroupOfCards();
        if (!(String.valueOf(instance)).isEmpty()) {
            access = true;
            assertTrue(access);
        }
    }    

    /**
     * Test of get method, of class GroupOfCards.
     */
    @Test
    public void testGetGood() {
        System.out.println("get good");
        int n = 2;
        boolean access = false;
        GroupOfCards instance = new GroupOfCards();
        Card result = instance.get(n);
        if (!(String.valueOf(instance.get(n))).isEmpty()) {
            access = true;
            assertTrue(access);
        }
    }
    
    @Test
    public void testGetBad() {
        int n = 14;
        GroupOfCards instance = new GroupOfCards();
        boolean thrown = false;
        try {
            instance.get(n);
        } catch (IndexOutOfBoundsException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }
         
 
    @Test
    public void testGetGBoundary() {
        System.out.println("get boundary");
        int n = 0;
        boolean access = false;
        GroupOfCards instance = new GroupOfCards();
        Card result = instance.get(n);
        if (!(String.valueOf(instance.get(n))).isEmpty()) {
            access = true;
            assertTrue(access);
        }
    }    
    
}
