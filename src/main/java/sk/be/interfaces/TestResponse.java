package sk.be.interfaces;

import sk.be.db.entity.Test;

import java.io.Serializable;

public class TestResponse implements Serializable {

    private Test test;

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
