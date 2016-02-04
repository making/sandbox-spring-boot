package net.nagaseyasuhito.sandbox;

import java.util.concurrent.ExecutionException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.java.Log;

@Log
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class AwesomeAsyncServiceTest {

	@Autowired
	private AwesomeAsyncService awesomeAsyncService;

	@Test
	public void test() throws InterruptedException, ExecutionException {
		log.info(this.awesomeAsyncService.process("nagaseyasuhito").get());
	}
}
