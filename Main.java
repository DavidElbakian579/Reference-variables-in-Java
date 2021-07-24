/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro8l3;

import java.util.Arrays;

/**
 *
 * @author David-pc
 * Массив значений
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 1
        Часто перед началом использования массива его необходимо заполнить значениями по умолчанию.
        Реализуй такое заполнение в методе fillArray(Integer[] array, int value).
        В качестве аргументов метод принимает массив и значение, которым его необходимо заполнить.
        Массив заполняется полностью, независимо от его длины.        
        */
        
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
        
        /* 2
        Иногда необходимо заполнить какую-то часть массива одинаковыми значениями или же удалить существующие (присвоить значение null).
        Реализуй для этого более гибкий метод fillArray(Integer[] array, int value, int begin, int end), где:
        array — массив, который необходимо заполнить;
        value — значение, которым необходимо заполнить;
        begin — начиная с какого индекса необходимо заполнять (включительно);
        end — на каком индексе остановить заполнение (исключая).
        */
        
        Integer[] array2 = new Integer[5];
        fillArray2(array2, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }
    
    public static void fillArray(Integer[] array, int value){
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }
    
    public static void fillArray2(Integer[] array, int value, int begin, int end) {
        for (int i = begin; i < end; i++) {
            array[i] = value;
        }
    }
    
}
