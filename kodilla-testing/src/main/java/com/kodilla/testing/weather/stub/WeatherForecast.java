package com.kodilla.testing.weather.stub;

import java.util.*;
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
        //temperatures.getTemperatures().entrySet().size();
        double resultMap;

        double sum = 0.0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            sum += temperature.getValue();
        }

        System.out.println(sum);
        resultMap = sum / temperatures.getTemperatures().entrySet().size();

        return resultMap;
    }

    public double calculateMedian() {

        List<Double> values = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(values);
        int size = values.size();
        if (size % 2 == 0) {
            return (values.get(size / 2) + values.get(size / 2 - 1)) / 2;
        }
        return values.get(size / 2);
    }
}
