package com.ip.client;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class IpController {

	@Value("${ipservice.url}")
	private String url;

	@HystrixCommand(fallbackMethod = "localAddress")
	@RequestMapping("/ip")
	public IpAddress ipaddress() {
		RestTemplate template = new RestTemplate();
		return template.getForEntity(url + "/ip", IpAddress.class).getBody();
	}

	public IpAddress localAddress() throws UnknownHostException {
		return new IpAddress(-1, InetAddress.getLocalHost().getHostAddress(), "Returning local address");
	}

}
