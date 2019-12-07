package com.cfhayes.patterns.abstractfactory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PatternTests {

  @DisplayName("Test credit card factory")
  @ParameterizedTest(name = "Credit score is {0} and card type is {1}")
  @CsvSource({
          "600,GOLD,VisaGoldCreditCard",
          "650,GOLD,VisaGoldCreditCard",
          "651,GOLD,AmexGoldCreditCard"
  })
  public void testCreditCardFactory(String score, String type, String card) {
    CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(Integer.parseInt(score));
    CardType cardType;
    switch (type) {
      case "GOLD": cardType = CardType.GOLD;
      break;
      case "PLATINUM": cardType = CardType.PLATINUM;
      default:
        throw new UnsupportedOperationException("Unsupported Card Type!");
    }
    CreditCard creditCard = creditCardFactory.getCreditCard(cardType);
    assertTrue(creditCard.getClass().getSimpleName().equals(card));
  }

}
