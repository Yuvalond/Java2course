package ru.mirea.ikbo2822.ulyanov.lab18.ex5;

public class Main {
    public static void main(String[] args){
        Integer[][] data1 = { { 1, 2 },
                              { 3, 4 } };

        Integer[][] data2 = { { 5, 6 },
                              { 7, 8 } };

        Matrix<Integer> matrix1 = new Matrix<>(data1);
        Matrix<Integer> matrix2 = new Matrix<>(data2);

        System.out.println("Matrix 1:");
        matrix1.printMatrix();
        System.out.println("Matrix 2:");
        matrix2.printMatrix();

        System.out.println("Matrix 1 + Matrix 2:");
        Matrix<Integer> sumResult = matrix1.add(matrix2);
        sumResult.printMatrix();

        System.out.println("Matrix 1 - Matrix 2:");
        Matrix<Integer> subtractResult = matrix1.subtraction(matrix2);
        subtractResult.printMatrix();

        System.out.println("Matrix 1 multiplied by 2:");
        Matrix<Integer> scalarResult = matrix1.multiply(2);
        scalarResult.printMatrix();

        System.out.println("Matrix 1 multiplied by Matrix 2:");
        Matrix<Integer> multiplyResult = matrix1.multiply(matrix2);
        multiplyResult.printMatrix();

        System.out.println("Transposed Matrix 1:");
        Matrix<Integer> transposedResult = matrix1.transpose();
        transposedResult.printMatrix();
    }
}
