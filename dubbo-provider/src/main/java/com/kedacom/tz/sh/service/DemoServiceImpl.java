package com.kedacom.tz.sh.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

import com.ysl.api.request.DemoParam;
import com.ysl.api.response.DemoVo;
import com.ysl.api.service.DemoService;

@DubboService(version = "${dubbo.application.version}")
public class DemoServiceImpl implements DemoService {

	@Value("${dubbo.application.name}")
	private String serviceName;

	@Override
	public DemoVo demo(DemoParam param) {
		DemoVo demo = new DemoVo(2L, serviceName, 27, "ysl@kedacom.com", "123456");
		return demo;
	}

}
