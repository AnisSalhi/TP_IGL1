package main;

/**
 * Created by Lenovo on 21/10/2017.
 */
public class VectorHelper {
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
