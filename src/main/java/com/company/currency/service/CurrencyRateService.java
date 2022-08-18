package com.company.currency.service;

import com.company.currency.dto.CurrencyRateDTO;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

// @Slf4j - for logging.
@Slf4j
@Service
public class CurrencyRateService implements ICurrencyRateService {
  // TODO: implement.
  @Override public CurrencyRateDTO getRate(String target, String base, BigDecimal amount, LocalDate date) {
    return null;
  }
}
