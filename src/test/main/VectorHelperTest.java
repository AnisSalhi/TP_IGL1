package main;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by Lenovo on 21/10/2017.
 */
public class VectorHelperTest {
    @Test
    public void sortVectorTest() throws Exception {
        ArrayList<Integer> test= new ArrayList<>();
        test.add(0,1);
        test.add(1,8);
        test.add(2,9);
        test.add(3,7);
        int [] test1=new int[4];
        test1[0]=1;
        test1[1]=7;
        test1[2]=8;
        test1[3]=9;
        Vector a=new Vector(test,4);
        VectorHelper.sortVector(a);
        for(int i=0; i<=3; i++) assertEquals((int)a.coordinates.get(i),test1[i]);
    }

    @Test
    public void switchElementsTest() throws Exception {
        ArrayList<Integer> test= new ArrayList<>();
        test.add(0,1);
        test.add(1,8);
        test.add(2,9);
        test.add(3,7);
        int [] test1=new int[4];
        test1[0]=7;
        test1[1]=9;
        test1[2]=8;
        test1[3]=1;
        Vector a=new Vector(test,4);
        VectorHelper.switchElements(a);
        for(int i=0; i<=3; i++) assertEquals((int)a.coordinates.get(i),test1[i]);
    }

    @Test
    public void getMinMaxTest() throws Exception {
        ArrayList<Integer> test= new ArrayList<>();
        test.add(0,-1);
        test.add(1,15);
        test.add(2,3);
        test.add(3,7);
        Vector a=new Vector(test,4);
        String minmax="MIN=-1 MAX=15";
        String minmaxtst=VectorHelper.getMinMax(a);
        assertEquals(minmax,minmaxtst);

    }

}