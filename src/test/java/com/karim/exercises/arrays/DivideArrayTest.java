package com.karim.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideArrayTest {

    /**
     * uso la assertEquals specifica per l'array per fare il test: come primo argomento c'è l'array che mi aspetto come risultato,
     * come secondo argomento c'è l'array che viene calcolato dal metodo (devo chiarame Classe.metodo(argomenti metodo) )
     */
    @Test
    void divideArray() {
        assertArrayEquals(new double[]{0.5, 0.5, 0.5}, DivideArray.divideArray(new double[]{1, 1, 1}, 2));
    }
}