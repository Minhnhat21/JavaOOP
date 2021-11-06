/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai17;

/**
 *
 * @author nguye
 */
public class Array2DExample {
    public static void main(String[] args) {
        int[][] matran = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
        
        for (int i = 0; i < matran.length; i++) {
            for (int j = 0; j < matran[i].length; j++) {
                System.out.print(matran[i][j] + " ");
            }
            System.out.println();
        }
    }
}
