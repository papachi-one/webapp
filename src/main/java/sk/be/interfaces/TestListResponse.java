package sk.be.interfaces;

import sk.be.db.entity.Test;

import java.io.Serializable;
import java.util.List;

public class TestListResponse implements Serializable {

    private List<Test> testList;

    public List<Test> getTestList() {
        return testList;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
    }
}
