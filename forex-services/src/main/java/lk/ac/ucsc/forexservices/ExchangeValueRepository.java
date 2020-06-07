package lk.ac.ucsc.forexservices;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    //Select * from exchangevalue where from = USD and to = LKR
    ExchangeValue findByFromAndTo(String from, String to);
}
