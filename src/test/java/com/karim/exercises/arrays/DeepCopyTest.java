package com.karim.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeepCopyTest {

    @Test
    void deepCopy() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] deepCopy = DeepCopy.deepCopy(matrix);
        //controllo che l'array del secondo strato in posizione 0 e posizione 1 non siano gli stessi oggetti di (rispettivamente)
        // array del secondo strato in posizione 0 e posizione 1 dell'array di array di partenza,
        // ovvero che i riferimenti (in pos 0 e 0, in pos 1 e 1) non puntino allo stesso oggetto.
        assertTrue(deepCopy[0] != matrix[0]);
        assertTrue(deepCopy[1] != matrix[1]);
    }
}