/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TimeStampTest {
    
    TimeStamp ts1, ts2;
    
    public TimeStampTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ts1 = new TimeStamp(2003, 8, 21, 21,32,34);
        ts2 = new TimeStamp(2003, 9, 13, 21,1,1);
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void testSetYear(){
        System.out.print("setYear-->");
        ts1.setYear(2001);
        assertEquals(2001, ts1.getYear());
        System.out.println("ok");
    }
    @Test
    public void testSetMonth(){
        System.out.print("setMonth-->");
        ts1.setMonth(7);
        assertEquals(7, ts1.getMonth());
        System.out.println("ok");
    }
    @Test
    public void testSetDay(){
        System.out.print("setDay-->");
        ts1.setDay(16);
        assertEquals(16, ts1.getDay());
        System.out.println("ok");
    }
    @Test
    public void testSetHour(){
        System.out.print("setHour-->");
        ts1.setHour(25);
        assertEquals(0, ts1.getHour());
        System.out.println("ok");
    }
    @Test
    public void testSetMinutes(){
        System.out.print("setMinutes-->");
        ts1.setMinutes(34);
        assertEquals(34, ts1.getMinutes());
        ts1.setMinutes(62);
        assertEquals(1, ts1.getMinutes());
        ts1.setMinutes(-1);
        assertEquals(1, ts1.getMinutes());
        System.out.println("ok");
    }
    @Test
    public void testSetSeconds(){
        System.out.print("setSeconds-->");
        ts1.setSeconds(45);
        assertEquals(45, ts1.getSeconds());
        ts1.setSecond(-1);
        assertEquals(1, ts1.getSecond());
        ts1.setSeconds(61);
        assertEquals(1, ts1.getSeconds());
        System.out.println("ok");
    }
    @Test
    public void testGetYear(){
        System.out.print("getYear-->");
        int res = ts1.getYear();
        assertEquals(2003, res);
        System.out.println("ok");
    }
    @Test
    public void testGetMonth(){
        System.out.print("getMonth-->");
        assertEquals(8, ts1.getMonth());
        System.out.println("ok");
    }
    @Test
    public void testGetDay(){
        System.out.print("getDay-->");
        assertEquals(21, ts1.getDay());
        System.out.println("ok");
    }
    @Test
    public void testGetHour(){
        System.out.print("getHour-->");
        assertEquals(21, ts1.getHour());
        System.out.println("ok");
    }
    @Test
    public void testGetMinutes(){
        System.out.print("getMinutes-->");
        assertEquals(32, ts1.getMinutes());
        System.out.println("ok");
    }
    @Test
    public void testGetSeconds(){
        System.out.print("getSeconds-->");
        assertEquals(34, ts1.getSeconds());
        System.out.println("ok");
    }
    @Test
    public void testAddG(){
        System.out.print("addG-->");
        ts1.addG(1);
        assertEquals(22, ts1.getDay());
        System.out.println("ok");
    }
    @Test
    public void testAddS(){
        System.out.print("addS-->");
        ts1.addS(12);
        assertEquals(46, ts1.getSeconds());
        ts1.addS(40);
        assertEquals(14, ts1.getSeconds());
        System.out.println("ok");
    }
    @Test
    public void testDiffG(){
        System.out.print("diffG-->");
        int res = ts1.diffG(ts2);
        assertEquals(23, res);
        System.out.println("ok");
    }
    @Test
    public void testDiffS(){
        System.out.print("diffS-->");
        int res = ts1.diffS(ts2);
        assertEquals(1985307, res);
        System.out.println("ok");
    }
    @Test 
    public void testGetTotalSec(){
        System.out.print("getTotalSec-->");
        assertEquals(1061501554, ts1.getTotalSec());
    }
}
