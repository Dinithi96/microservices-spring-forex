package lk.ac.ucsc.currencyconversion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyConversionController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ForexServiceProxy ForexService;

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
                                                  @PathVariable double quantity) {

//            Map<String, String> uriVariables = new HashMap<>();
//            uriVariables.put("from", from);
//            uriVariables.put("to", to);
//
//            ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(
//                    "http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,
//                    uriVariables);
//
//            CurrencyConversionBean response = responseEntity.getBody();

        CurrencyConversionBean response = ForexService.retrieveExchangeValue(from, to);

        return new CurrencyConversionBean(response.getId(), from, to, response.getConversionRate(), quantity,
                quantity * response.getConversionRate(), response.getPort());
    }
}

