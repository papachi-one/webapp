package sk.be;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.be.db.entity.Test;
import sk.be.interfaces.TestListResponse;
import sk.be.interfaces.TestRequest;
import sk.be.interfaces.TestResponse;
import sk.be.service.TestService;

import java.util.List;

@Tag(name = "test", description = "CRUD operations")
@RestController
public class HelloController {


    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/hello")
    public TestListResponse hello() {

        List<Test> allTests = testService.getAllTests();

        TestListResponse response = new TestListResponse();
        response.setTestList(allTests);
        return response;
    }

    @RequestMapping(value = "/hello/id")
    public TestResponse helloRequest(@RequestBody TestRequest request) {
        TestResponse response = new TestResponse();
        response.setTest(testService.getById(request.getId()));

        return response;
    }


}
