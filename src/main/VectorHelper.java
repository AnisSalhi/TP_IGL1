package main;

/**
 * Created by Lenovo on 21/10/2017.
 */
public class VectorHelper {
    /**
     * <p>trie les elements d'un tableaux par ordre croissante .</p>
     * <p>cette methode utilse le trie par selection</p>
     * @param vector
     *   le tableaux des entiers non trié
     */
    public static void sortVector (Vector vector) {
        int temp;
        for (int i=0; i<=vector.coordinates.size()-2; i++){
            for(int j=i+1; j<=vector.coordinates.size()-1; j++){
                if (vector.coordinates.get(i)>vector.coordinates.get(j)){
                    temp=vector.coordinates.get(i);
                    vector.coordinates.set(i,vector.coordinates.get(j));
                    vector.coordinates.set(j,temp);

                }
            }
        }
    }

    /**
     * <p>inverser les elements d'un tableaux .</p>
     * @param vector
     *      tableaux des entiers .
     */
    public static void switchElements (Vector vector){
        /**
         * j inialisé au l'indice de dernier element du tableaux .
         */
        int temp;
        int j=vector.coordinates.size()-1;
        for (int i=0 ; i<=((vector.coordinates.size()-1)/2);i++){
            temp=vector.coordinates.get(i);
            vector.coordinates.set(i,vector.coordinates.get(j));
            vector.coordinates.set(j,temp);
            j--;
        }
    }

}
