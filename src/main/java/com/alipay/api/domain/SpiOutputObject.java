package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * SPI出参复杂数据结构
 *
 * @author auto create
 * @since 1.0, 2019-10-29 14:07:00
 */
public class SpiOutputObject extends AlipayObject {

	private static final long serialVersionUID = 1638839196924423916L;

	/**
	 * test
	 */
	@ApiField("age")
	private String age;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

}