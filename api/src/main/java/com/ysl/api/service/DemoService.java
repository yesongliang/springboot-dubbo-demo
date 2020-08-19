package com.ysl.api.service;

import com.ysl.api.request.DemoParam;
import com.ysl.api.response.DemoVo;

public interface DemoService {

	DemoVo demo(DemoParam param);
}
