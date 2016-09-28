package org.zw.service.impl;

import org.springframework.stereotype.Service;
import org.zw.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String getMessage() {
		return "Hi";
	}
}
