package com.test.AEM.EngineeringTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.test.AEM.EngineeringTest.Entity.IntergerToRoman;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class RomanNumeralUnitTests {

	@Test
	@Parameters({ "1, I", "20, XX", "27, XXVII", "245, CCXLV", "1099, MXCIX", "3999, MMMCMXCIX" })
	public void TestValidInputs(int numeral, String expectedRomanNumeral) {
		IntergerToRoman rN = new IntergerToRoman(numeral);
		assertEquals(expectedRomanNumeral, rN.toString());
	}

	@Test
	@Parameters({ "-12", "-1", "0", "4233", })
	public void TestInvalidRomanInputs(int numeral) {
		IntergerToRoman rN = new IntergerToRoman(numeral);
		assertEquals("", rN.toString());
	}
}