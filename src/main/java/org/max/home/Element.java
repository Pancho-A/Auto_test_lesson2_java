package org.max.home;

public class Element implements IElements{

    private  int count;

    public Element(int count) {
        this.count = count;
    }

    @Override
    public int getCount() {
        return count;
    }
}
