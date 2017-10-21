package main;

import java.util.ArrayList;

/**
 * Created by Lenovo on 21/10/2017.
 */
public class Vector {
    ArrayList< Integer > coordinates ;
    int dimension;

    public Vector() {
        dimension = 0;
        coordinates = new ArrayList<>();
    }

    public Vector(ArrayList<Integer> coordinates ,int dimension){
        this.coordinates = coordinates;
        this.dimension = dimension;
    }
}
