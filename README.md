# AEMEngineering

This web service takes an number of type Integer and converts to Roman.

Wikipedia: https://en.wikipedia.org/wiki/Roman_numerals

Input range: [1-3999]

# Project Layout

### SoureCode
1. The Entity class is present in "EngineeringTest/src/main/java/com/test/AEM/EngineeringTest/Entity"
2. The Controller is present in "EngineeringTest/src/main/java/com/test/AEM/EngineeringTest/controller"
3. The SpringBoot application starter file is present in "EngineeringTest/src/main/java/com/test/AEM/EngineeringTest/EngineeringTestApplication"

### TestFiles
1. The test files are present in "EngineeringTest/src/test/java/com/test/AEM/EngineeringTest"

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

# Running the Project
1. Clone the repository and import the project into any IDE (IntelliJ, Eclipse)
2. Import the project as Maven.
3. Navigate to "EngineeringTest/src/main/java/com/test/AEM/EngineeringTest/EngineeringTestApplication" to locate the SpringBoot application file.
4. RightClick on the file then click "Run"
5. The server should start on port "localhost:8080"
6. In POSTMAN, use the following GET call: "http://localhost:8080/v1/integertToRoman/1099", replace "1099" with any integer between 1-3999
7. For Valid Inputs we will get 200 HTTP status with corresponding response and for Invalid Inputs we qill 400 http status code
## Running test-cases
1. If using IntelliJ, right-click on project, there will be an option to "Run 'all Tests'"
2. If using Eclipse, navigate to "EngineeringTest/src/test/java/com/test/AEM/EngineeringTest/RomanNumeralUnitTests.java", rihgt-click on file and then select Run As -> JUnit Test (If prompted select "RomanNumeralUnitTests")


## Metrics, Monitoring, Logging
For devops capabilities, Prometheus and Grafana is used.
Prometheus: Prometheus is a monitoring solution for storing time series data like metrics.
Grafana: Grafana allows to visualize the data stored in Prometheus.

## Steps need to follow to see metrics and logs
1. Download Prometheus from: https://prometheus.io/download/
2. After extracting the zip file, navigate to the extracted folder ands start Prometheus server.
3. Navigate to the Prometheus.YAML file and add the follwong lines:

""  - job_name: "spring-actuator"

    metrics_path: '/actuator/prometheus'
    
    scrape_interval: 5s
    
    static_configs: 
    
    - targets: ['localhost:8080'] ""

      
5. Dependicies are already added in the project, the Prometheus server should start on port localhost:9090
6. Navigate to Status-> Targets to verify the server is up and running
7. On graph tab, we would be able to see various metrics for ex CPU usage, JVM Memory_usage
   
![CPU-usage](https://github.com/JuhiSingh25/AEMEngineering/assets/89157686/381b5401-2810-4b9f-a1c6-a8c089cbacd4)
![JVM_memory_used](https://github.com/JuhiSingh25/AEMEngineering/assets/89157686/bfe2d171-a79d-49eb-9177-154979c0e492)

7. Download Grafana from "https://grafana.com/grafana/download?platform=windows"
8. Extract and navigate to "bin" folder and using powershell, start grafana, the grafana should start on port "localhost:3000"
9. If ask for username/password, use "admin" as username and "passowrd" as password
10. Add DataSource as "Prometheus" in DashBoard and select the metrics needed.
11. This will create a dashboard having all the metrics at one place with visulaization
    
![Grafana Dashboard](https://github.com/JuhiSingh25/AEMEngineering/assets/89157686/6fbd0c0b-fe93-4906-9762-dfa76c32d34a)
