package br.com.lucasfeitosa;

public class Wrapper {

    private int intPrimitivo;
    private Integer intWrapper;


    public int getIntPrimitivo() {
        return intPrimitivo;
    }

    public void setIntPrimitivo(int intPrimitivo) {
        this.intPrimitivo = intPrimitivo;
    }

    public Integer getIntWrapper() {
        return intWrapper;
    }

    public void setIntWrapper(Integer intWrapper) {
        this.intWrapper = intWrapper;
    }

    public Integer convertPrimitiveInToWrapper(int value) {
        return new Integer(value);
    }
}
