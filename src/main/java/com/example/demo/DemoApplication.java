package com.example.demo;

import io.sentry.Sentry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Sentry.init(options -> {
			options.setDsn("https://eb15b6c47320401780d376e2524f49b8@o319267.ingest.sentry.io/1864663");
			// Set tracesSampleRate to 1.0 to capture 100% of transactions for performance monitoring.
			// We recommend adjusting this value in production.
			options.setTracesSampleRate(1.0);
			// When first trying Sentry it's good to see what the SDK is doing:
			options.setDebug(true);
		});
	}

}
