package airport.directory.dto;

import airport.directory.model.Offer;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class OfferTypeDto {

    private String offerType;

    private List<Offer> offerList = new ArrayList<Offer>();
}
