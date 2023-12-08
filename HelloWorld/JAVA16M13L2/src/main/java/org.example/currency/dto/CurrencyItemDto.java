package org.example.currency.dto;

import lombok.*;
import org.example.currency.Currency;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CurrencyItemDto {

//    {
//        "ccy":"EUR",
//            "base_ccy":"UAH",
//            "buy":"39.65000",
//            "sale":"40.65000"
//    }

    private Currency ccy;

    private Currency base_ccy;

    private String buy;

    private String sale;


}
