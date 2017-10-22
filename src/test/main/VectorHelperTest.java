package main;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Lenovo on 21/10/2017.
 */
public class VectorHelperTest {
    @Test
    public void sumVectors() throws Exception {
        Vector vone = new Vector(new ArrayList<>(),3);
        vone.coordinates.add(2);
        vone.coordinates.add(2);
        vone.coordinates.add(2);

        Vector vtwo = new Vector(new ArrayList<>(),3);
        vtwo.coordinates.add(3);
        vtwo.coordinates.add(3);
        vtwo.coordinates.add(3);
        Vector vresult = new Vector(new ArrayList<>(), 3);
        vresult.coordinates.add(5);
        vresult.coordinates.add(5);
        vresult.coordinates.add(5);
        try {
            assertEquals(VectorHelper.sumVectors(vone,vtwo),vresult);
        } catch (DifferentVectorDimensionException e) {
            e.printStackTrace();
        }
    }



    @Test
    public void multiplyCoordinatesBy() throws Exception {

    }

}