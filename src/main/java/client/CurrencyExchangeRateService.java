package client;

import entity.CurrencyExchange;

import java.util.Optional;

/**
 * @author Pavel Pscheidl
 */
public interface CurrencyExchangeRateService {

    public Optional<CurrencyExchange> findLatest();
}
