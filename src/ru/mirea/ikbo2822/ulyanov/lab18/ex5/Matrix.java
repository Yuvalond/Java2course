package ru.mirea.ikbo2822.ulyanov.lab18.ex5;

import ru.mirea.ikbo2822.ulyanov.lab18.ex4.Calculator;

import java.lang.reflect.Array;

//Написать класс Matrix, на основе обобщенного типа, реализовать
//операции с матрицами
public class Matrix<T extends Number> {
    private final T[][] matrix;
    private final int rows;
    private final int cols;

    public Matrix(T[][] matrix){
        this.matrix = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;
    }

    // вывести
    public void printMatrix(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // сложение
    public Matrix<T> add (Matrix<T> other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition");
        }

        @SuppressWarnings("unchecked")
        T[][] result = (T[][]) Array.newInstance(matrix[0][0].getClass(), rows, cols);

        for (int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                result[i][j] = Calculator.sum(matrix[i][j],other.matrix[i][j]);
            }
        }
        return new Matrix<>(result);
    }
    // вычитание
    public Matrix<T> subtraction (Matrix<T> other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition");
        }

        @SuppressWarnings("unchecked")
        T[][] result = (T[][]) Array.newInstance(matrix[0][0].getClass(), rows, cols);

        for (int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                result[i][j] = Calculator.subtraction(matrix[i][j],other.matrix[i][j]);
            }
        }
        return new Matrix<>(result);
    }

    // умножение на другую матрицу
    public Matrix<T> multiply(Matrix<T> other){
        if(cols != other.rows){
            throw new IllegalArgumentException("Number of columns in the first matrix must be match the number of rows in the second matrix for multiplication");
        }
        @SuppressWarnings("unchecked")
        T[][] result = (T[][]) Array.newInstance(matrix[0][0].getClass(), rows, cols);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j <other.cols; j++){
                result[i][j] = zeroValueForType();
                for(int k = 0; k < cols; k++){
                    result[i][j] = Calculator.sum(result[i][j],(Calculator.multiply(matrix[i][k],other.matrix[k][j])));
                }
            }
        }
        return new Matrix<>(result);
    }

    private T zeroValueForType() {
        if (matrix[0][0].getClass() == Integer.class) {
            return (T) (Object) 0;
        }
        else if (matrix[0][0].getClass() == Double.class) {
            return (T) (Object) 0.0;
        }
        else if (matrix[0][0].getClass() == Float.class) {
            return (T) (Object) 0.0;
        }
        else {
            return null; // Возврат null по умолчанию для других типов
        }
    }

    //умножение на число
    public Matrix<T> multiply(int value){
        @SuppressWarnings("unchecked")
        T[][] result = (T[][]) Array.newInstance(matrix[0][0].getClass(), rows, cols);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j <cols; j++){
                result[i][j] = Calculator.multiply(matrix[i][j],value);
            }
        }
        return new Matrix<>(result);
    }

    // транспонирование
    public Matrix<T> transpose(){

        @SuppressWarnings("unchecked")
        T[][] result = (T[][]) Array.newInstance(matrix[0][0].getClass(), rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return new Matrix<>(result);
    }
}
