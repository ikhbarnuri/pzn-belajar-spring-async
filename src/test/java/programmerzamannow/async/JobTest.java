package programmerzamannow.async;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

@SpringBootTest
public class JobTest {

    @Autowired
    private Job job;

    @Test
    void job() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(4));
        Assertions.assertEquals(2L, job.getValue());
    }
}
