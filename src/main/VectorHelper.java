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

    /**
     * <p>retourner le Min et le Max d'un tableau donner . </p>
     * @param vector
     *  tab des entiens .
     */
    public static String getMinMax (Vector vector){
        int min=vector.coordinates.get(0);
        int max=vector.coordinates.get(0);
        for (int i=0 ; i<=vector.coordinates.size()-1; i++){
            if (vector.coordinates.get(i)<min) min=vector.coordinates.get(i) ; else
            if (vector.coordinates.get(i)>max) max=vector.coordinates.get(i);
        }
        String reslt="MIN="+min+" MAX="+max;
        return reslt;
    }
    /**
     * <p>sommer l'element d'indice i du tableau 1 avec l'element d'indice i de tableau 2 </p>
     * @param vOne
     *      un vecteur des entiers
     * @param vTwo
     *      un vecteur des entiers
     * @return un vecteur de meme taille de vOne et vTwo et qui contient les sommes des elements de ses deux vecteurs
     * @throws DifferentVectorDimensionException
     *  <p>Exeption lever dans le cas la taille des deux vecteurs se differe </p>
     */
    public static Vector sumVectors(Vector vOne ,Vector vTwo) throws DifferentVectorDimensionException {
        if (vOne.dimension == vTwo.dimension){
            Vector sumResult = new Vector();
            sumResult.dimension = vOne.dimension;
            for(int i = 0;i<sumResult.dimension;i++){
                int c1 = vOne.coordinates.get(i);
                int c2 = vTwo.coordinates.get(i);
                sumResult.coordinates.add(c1+c2);
            }
            return sumResult;
        }else{
            throw new DifferentVectorDimensionException();
        }
    }


    private static int simpleMultiply(int firstInt, int secondInt){
        return  firstInt * secondInt;
    }

    /**
     * <p>Multiplier les elements d'un vecteur par un entier i </p>
     * @param vector
     *      un vecteur des entiers
     * @param i
     *      un entier
     * @return void
     */
    public static void multiplyCoordinatesBy(Vector vector , int i){
        for(int cor : vector.coordinates){
            cor = simpleMultiply(cor,i);
        }
    }

}
