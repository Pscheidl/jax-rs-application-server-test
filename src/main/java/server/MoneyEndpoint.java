package server;

import client.CurrencyExchangeRateService;
import entity.CurrencyExchange;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

/**
 * @author Pavel Pscheidl
 */
@Path("/money")
public class MoneyEndpoint {

    @Inject
    private CurrencyExchangeRateService currencyExchangeRateService;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getMoney() {
        Optional<CurrencyExchange> currencyExchange = currencyExchangeRateService.findLatest();
        if (currencyExchange.isPresent()) {
            return Response.ok(currencyExchange.get()).build();
        } else {
            return Response.noContent().build();
        }
    }
}
