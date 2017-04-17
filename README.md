# JAX-RS Connection pool test

## Invoking

Invoke the REST endpoint `/money` via HTTP GET. On localhost with unmodified context path:

GET `http://localhost:8080/jaxrs-client-1.0/money

To demonstrate, the API must be invoked "concurrently enough" to simulate at least two clients connecting at the same time. For example: `ab -n 1000 -c 100 http://localhost:8080/jaxrs-client-1.0/money`.

###Example response

```json
{
  "base": "EUR",
  "date": "2017-04-13",
  "rates": {
    "AUD": 1.4027,
    "BGN": 1.9558,
    "BRL": 3.3277,
    "CAD": 1.4069,
    "CHF": 1.0686,
    "CNY": 7.3227,
    "CZK": 26.704,
    "DKK": 7.4376,
    "GBP": 0.84763,
    "HKD": 8.2652,
    "HRK": 7.4255,
    "HUF": 312.55,
    "IDR": 14092,
    "ILS": 3.8841,
    "INR": 68.492,
    "JPY": 116.01,
    "KRW": 1202.9,
    "MXN": 19.766,
    "MYR": 4.6905,
    "NOK": 9.1033,
    "NZD": 1.5178,
    "PHP": 52.584,
    "PLN": 4.245,
    "RON": 4.5189,
    "RUB": 59.935,
    "SEK": 9.582,
    "SGD": 1.4845,
    "THB": 36.503,
    "TRY": 3.8991,
    "USD": 1.063,
    "ZAR": 14.38
  }
}
```

## Problem

Different JAX-RS implementations use different pooling strategy. This results in different reusability of WebTarget/Client.

- Deployment to an application server with Jersey as a JAX-RS implementation will work flawlessly, because Jersey uses HTTP connection pool internally by default. Example of such application server is Payara.
- Deployment to an application server with Resteasy as a JAX-RS implementation will cause an exception.

###Resteasy exception
```text
java.lang.IllegalStateException: Invalid use of BasicClientConnManager: connection still allocated.
Make sure to release the connection before allocating another one.
```
