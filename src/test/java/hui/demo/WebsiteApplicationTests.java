package hui.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebsiteApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(WebsiteApplicationTests.class);


	@Autowired
	RedisTemplate redisTemplate;


	@Test
	public void contextLoads() {


		Object ooo =  redisTemplate.opsForValue().get("*");

		logger.info(ooo.toString());
	}

}
