package com.example.covidapps;

import android.view.View;

import com.example.covidapps.model.covid.CountryHeader;


public interface CovidCountryClickableCallback {
    void onClick(View view, CountryHeader countryHeader);
}
