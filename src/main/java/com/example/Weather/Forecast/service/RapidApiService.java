package com.example.Weather.Forecast.service;

import org.springframework.http.ResponseEntity;

public interface RapidApiService {


    public ResponseEntity<String> RapidApiGetForecastSummaryByLocationName(String name);

    public ResponseEntity<String> RapidApiGetHourlyForecastByLocationName(String Name);



}