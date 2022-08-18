package com.company.currency.controller;

import com.company.currency.dto.CurrencyRateDTO;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;


public class CurrencyRateController implements CurrencyRateApi {
  // TODO: implement.
  @Override public CurrencyRateDTO getRate(String base, String target, LocalDate day, Optional<BigDecimal> amount) {
    return null;
  }
}
