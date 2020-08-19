package com.ysl.api.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemoParam implements Serializable {

	private static final long serialVersionUID = 7681388392354002181L;

	private String name;
	private String password;
}
