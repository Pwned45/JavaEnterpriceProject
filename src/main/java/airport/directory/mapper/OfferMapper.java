package airport.directory.mapper;

import airport.directory.dto.OfferDto;
import airport.directory.model.Offer;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface OfferMapper {
    Offer dtoToOffer(OfferDto offer_dto);

    OfferDto offerToDto(Offer offer);

    List<Offer> listDtoToListOffer(List<OfferDto> list_offer_dto);

    List<OfferDto> listOfferToListDto(List<Offer> list_offer);
}
