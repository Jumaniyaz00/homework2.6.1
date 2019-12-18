package com.company;

public class Flat<T, I extends Number> implements PrintAble<I> {
    private T number1;
    private I number2;

    public T getNumber1() {
        return number1;
    }

    public I getNumber2() {
        return number2;
    }

    public Flat(T number1, I number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public I print() {
        System.out.println(getNumber1()+" "+getNumber2());
        return null;
    }
}
