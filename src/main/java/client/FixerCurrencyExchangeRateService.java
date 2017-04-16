package client;

import entity.CurrencyExchange;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.client.WebTarget;
import java.util.Optional;

/**
 * @author Pavel Pscheidl
 */
@Named
@ApplicationScoped
public class FixerCurrencyExchangeRateService implements CurrencyExchangeRateService {

    @Inject
    private WebTarget exchangeRateService;

    //No error handling for simplicity
    @Override
    public Optional<CurrencyExchange> findLatest() {
        CurrencyExchange invoke = exchangeRateService.request()
                .buildGet()
                .invoke(CurrencyExchange.class);

        return Optional.of(invoke);
    }
}
