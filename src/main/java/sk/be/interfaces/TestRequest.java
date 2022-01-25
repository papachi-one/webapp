package sk.be.interfaces;

import java.io.Serializable;

public class TestRequest implements Serializable {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
