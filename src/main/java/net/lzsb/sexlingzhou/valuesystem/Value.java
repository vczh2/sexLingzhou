package net.lzsb.SexLingzhou.valuesystem;

/**
 * Project: SexLingzhou
 * -----------------------------------------------------------
 * Copyright © 2017 | lzsb | All rights reserved.
 */
public class Value<T> {

    private String valueName;
    private T valueObject;

    public Value(String valueName, T valueObject) {
        this.valueName = valueName;
        this.valueObject = valueObject;
    }

    public String getValueName() {
        return valueName;
    }

    public T getObject() {
        return valueObject;
    }

    public void setObject(T valueObject) {
        this.valueObject = valueObject;
    }
}
