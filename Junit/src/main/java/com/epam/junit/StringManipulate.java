package com.epam.junit;

public class StringManipulate {

	public String removeAInFirst2Positions(String string)
	{
		if (string.length()<=2)
		{
			return string.replaceAll("A", "");
		}
		String first2Chars = string.substring(0, 2);
		String stringMinusFirst2Chars = string.substring(2);
		return first2Chars.replaceAll("A", "") + stringMinusFirst2Chars;
	}
}
