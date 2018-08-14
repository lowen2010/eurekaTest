package test;

import com.lowen.RabbitmqApplication;
import com.lowen.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RabbitmqApplication.class)
public class RabbitmqTest {
    @Autowired
    private Sender sender;

    @Test
    public void test(){
        this.sender.send();
    }
}
