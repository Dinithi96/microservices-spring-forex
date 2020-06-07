package lk.ac.ucsc.forexservices;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
    @Id
    private Long id;
    @Column(name = "currency_from")
    private String from;

    @Column(name = "currency_to")
    private String to;
    private double conversionRate;

    private int port;

    public Long getId() {
        return id;
    }

    public void SetId(Long Id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom (String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public int getPort(){
        return port;
    }

    public void setPort(int port){
        this.port = port;
    }

    //id, from, to, conversionRate
}

