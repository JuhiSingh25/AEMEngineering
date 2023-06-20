# AEMEngineering

This web service takes an number of type Integer and converts to Roman.

Wikipedia: https://en.wikipedia.org/wiki/Roman_numerals

Input range: [1-3999]

# Project Layout

# Approach

1. Creating arrays: representing the Roman numeral symbols for ones, tens, hundreds, and thousands respectively. 

2. Divide the given number num into its respective place values:
thousands = num / 1000
hundreds = (num % 1000) / 100
tens = (num % 100) / 10
ones = num % 10

3. Concatenate the Roman numeral symbols based on the place values:
thousands[num/1000] represents the Roman numeral for thousands place.
hundreds[(num%1000)/100] represents the Roman numeral for hundreds place.
tens[(num%100)/10] represents the Roman numeral for tens place.
ones[num%10] represents the Roman numeral for ones place.

4. Return the concatenation of the Roman numeral symbols obtained from step 3.

# Endpoints

GET CALL: http://localhost:8080/v1/integertToRoman/1099

Response:

![image](https://github.com/JuhiSingh25/AEMEngineering/assets/89157686/7f924c8c-626b-400d-adca-3274a14df002)

(Invalid Response)
GET CALL: http://localhost:8080/v1/integertToRoman/-2
![image](https://github.com/JuhiSingh25/AEMEngineering/assets/89157686/5ba9d8d9-92fd-4e18-86f8-292a6040fa7a)


