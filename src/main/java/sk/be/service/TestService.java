package sk.be.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.be.db.entity.Test;
import sk.be.db.repository.TestRepository;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;



    public List<Test> getAllTests(){
        return testRepository.findAll();
    }

    public Test getById(Integer id) {
        return testRepository.getById(id);
    }
}
