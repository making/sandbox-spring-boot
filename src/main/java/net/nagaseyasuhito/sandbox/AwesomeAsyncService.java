package net.nagaseyasuhito.sandbox;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AwesomeAsyncService implements AsyncService {

	@Async
	public CompletableFuture<String> process(String source) {
		return CompletableFuture.completedFuture("Awesome async " + source + "!!!");
	}
}
