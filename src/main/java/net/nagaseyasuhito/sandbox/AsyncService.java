package net.nagaseyasuhito.sandbox;

import java.util.concurrent.CompletableFuture;

public interface AsyncService {
	CompletableFuture<String> process(String source);
}
