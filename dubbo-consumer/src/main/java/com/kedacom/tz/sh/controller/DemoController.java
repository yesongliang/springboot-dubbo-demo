package com.kedacom.tz.sh.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ysl.api.request.DemoParam;
import com.ysl.api.response.DemoVo;
import com.ysl.api.service.DemoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DemoController {

	@DubboReference(version = "${dubbo.provider.version}", check = false)
	private DemoService demoService;

	@HystrixCommand(fallbackMethod = "reliable")
	@GetMapping("/demo")
	public String demo() {
		DemoVo demo = demoService.demo(new DemoParam());
		log.info("result:{}", demo);
		return demo.toString();
	}

	public String reliable() {
		return "hystrix fallback,provider may be down.";
	}

}
