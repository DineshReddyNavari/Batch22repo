package com.zensar.olxadvertise.actuator;

import java.util.Random;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.status.Status;
@Component
public class CustomHealthIndicator extends AbstractHealthIndicator{

	@Override
	protected void doHealthCheck(Builder builder) throws Exception {
		Random random = new Random();
		int randomnumber = random.nextInt();
		if(randomnumber%2==0) {
			builder.up();
		}else
		{
			builder.down();
		}
		
	}

}
