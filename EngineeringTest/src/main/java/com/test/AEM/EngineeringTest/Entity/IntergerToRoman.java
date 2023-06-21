package com.test.AEM.EngineeringTest.Entity;


public class IntergerToRoman {
	
	/*
	logic: 
	created arrays that represent the Roman numeral symbols for each place value (ones, tens, hundreds, thousands). 
	Then, divided the given number into its respective place values and concatenate the corresponding Roman numeral symbols.
	*/
	
	private final Integer integerNumber;
    private final String romanNumber;
    
    private static final StringBuilder sb = new StringBuilder();
    
    private static final String[] thousands = {"", "M", "MM", "MMM"};
    private static final String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC","DCCC","CM"};
    private static final String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX","LXX","LXXX","XC"};
    private static final String[] ones = {"", "I", "II", "III", "IV", "V", "VI","VII","VIII","IX"};

    public IntergerToRoman(int number) {
        this.integerNumber = number;
        this.romanNumber = convert(number);
    }

    public String toString() {
        return this.romanNumber;
    }

    public int getIntegerNumber() {
        return this.integerNumber;
    }

    public String getRomanCode() {
        return this.romanNumber;
    }


    private String convert(int number)
    {
    	// added base condition for negative tests.
    	if(number < 1 || number > 3999)
    	{
    		return "";
    	}
    	
    	sb.setLength(0);
        
        sb.append(thousands[number/1000]);
        sb.append(hundreds[(number%1000)/100]);
        sb.append(tens[(number%100)/10]);
        sb.append(ones[number%10]);
        
        return sb.toString();
    }
}
