package com.ysl.api.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemoVo implements Serializable {

	private static final long serialVersionUID = -3581843599780842828L;

	private Long id;

	private String name;

	private Integer age;

	private String email;

	private String password;
}
