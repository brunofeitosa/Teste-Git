package com.github.utils;

public class StringUtils {
	public static boolean isNullOrEmpty(String string) {
		return (string == null) || (string.trim().isEmpty());
	}
}
