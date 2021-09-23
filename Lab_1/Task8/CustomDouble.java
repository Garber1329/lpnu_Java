package com.company.Task8;

public class CustomDouble {
    private int a;
    private double b;

    public CustomDouble(final int a, final double b) {
        this.a = a;
        this.b = b;
        if (b >= 1.0) {
            System.out.println("The fractional part cannot be larger than one!");
            return;
        }
    }

    public CustomDouble(final double res) {
        this.a = (int) res;
        this.b = res - a;
    }


    public CustomDouble division(final CustomDouble second) {
        final double res = this.toDouble() / second.toDouble();

        return new CustomDouble(res);
    }

    public CustomDouble sum(final CustomDouble second) {
        final double res = this.toDouble() + second.toDouble();

        return new CustomDouble(res);
    }

    public CustomDouble subtraction(final CustomDouble second) {
        final double res = this.toDouble() - second.toDouble();

        return new CustomDouble(res);
    }

    public void comparisons(final CustomDouble second) {
        final double res = this.toDouble() - second.toDouble();

        if(res > 0){
            System.out.println("First number larger than second");
        }else if (res == 0){
            System.out.println("Numbers is equal");
        }else{
            System.out.println("Second number larger than first");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final CustomDouble that = (CustomDouble) o;

        if (a != that.a) return false;
        return Double.compare(that.b, b) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        final long temp;
        result = a;
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double toDouble() {
        return (double) this.a + this.b;
    }


    public int getA() {
        return a;
    }

    public void setA(final int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(final double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "CustomDouble{" + "a=" + a + ", b=" + b + '}';
    }
}
