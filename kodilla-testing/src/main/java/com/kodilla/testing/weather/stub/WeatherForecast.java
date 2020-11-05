package com.kodilla.testing.weather.stub;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage() {

        double resultMap;

        double sum = 0.0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        System.out.println(sum);
        resultMap=sum/ temperatures.size();

        return  resultMap;
    }

    public double calculateMedian(){

        double median;

        for (Map.Entry<String,Double>temperature :temperatures.getTemperatures().entrySet()){
            temperature.getValue();
            Collections.sort(temperatures);
        }

        if(temperatures.size()%2==0){
            median=(temperatures.size()/2+temperatures.size()/2-1)/2;
        }else{ median=temperatures.size()/2;
        }

//        if(temperatures.size()%2!=0){
//             median=temperatures.get(temperatures.size()/2+temperatures.size()/2+1);
//          }
//        else {
//            median=temperatures.get(temperatures.size()/2-1);
//        }
        return median;
    }
}
