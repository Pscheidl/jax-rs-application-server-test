package client;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 * WebTarget producer for Fixer.io currency exchange rate service
 *
 * @author Pavel Pscheidl
 */
@Named
@ApplicationScoped
public class FixerWebTargetProducer {

    private Client fixerClient;

    @PostConstruct
    private void postConstruct() {
        fixerClient = ClientBuilder.newClient();
    }

    @Produces
    @ApplicationScoped
    public WebTarget produceFixerWebTarget() {
        return fixerClient.target("http://api.fixer.io/latest");
    }
}
