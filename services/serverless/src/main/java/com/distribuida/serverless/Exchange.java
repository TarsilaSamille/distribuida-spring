package com.distribuida.serverless;

import java.util.function.Function;

public class Exchange implements Function<String, String> {
	@Override
	public String apply(String value) {
		return value.toUpperCase() + " 2";
	}
}