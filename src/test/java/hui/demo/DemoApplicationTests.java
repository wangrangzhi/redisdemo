package hui.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {



	@Autowired PersonRepository repo;
	private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);



	@Test
	public void basicCrudOperations() {

		Person rand = new Person();
		rand.setFirstname("wangzhe");
		rand.setLastname("dddddddd");
		Address a =  new Address();
		a.setStreet("ddddddd");
		rand.setAddress(a);
		rand.setId("ty");

		repo.save(rand);

		Optional<Person> personOptional =  repo.findById(rand.getId());

		if(personOptional.isPresent())
		{
			logger.info( personOptional.get().toString());
		}

		repo.count();

		//repo.delete(rand);
	}

}
