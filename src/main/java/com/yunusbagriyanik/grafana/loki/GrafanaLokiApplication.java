package com.yunusbagriyanik.grafana.loki;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.Instant;
import java.util.UUID;

@SpringBootApplication
@Configuration
@EnableScheduling
@Slf4j
public class GrafanaLokiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrafanaLokiApplication.class, args);
	}

	@Scheduled(fixedDelay = 1000)
	private void run() {
		log.info("{} ScheduleTask.run() Date: {} ", UUID.randomUUID(), Instant.now());
	}
}
