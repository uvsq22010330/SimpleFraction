package com.raouf;

public class Fraction {
    int e;
    int d;
    Fraction(int e, int d) {
        this.e = e;
        this.d = d;
    }

    public String toString(int e, int d){
        String g = Integer.toString(e)+"/"+Integer.toString(d);
        return (g);
    }

}
