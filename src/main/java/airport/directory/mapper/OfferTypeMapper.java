package airport.directory.mapper;

import airport.directory.dto.OfferTypeDto;
import airport.directory.model.OfferType;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface OfferTypeMapper {
    OfferType dtoToOfferType(OfferTypeDto offerType_dto);

    OfferTypeDto offerTypeToDto(OfferType offerType);

    List<OfferType> listDtoToListOfferType(List<OfferTypeDto> list_offerType_dto);

    List<OfferTypeDto> listOfferTypeToListDto(List<OfferType> list_offerType);
}
