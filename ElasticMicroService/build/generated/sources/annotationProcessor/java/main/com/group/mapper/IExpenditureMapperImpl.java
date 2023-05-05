package com.group.mapper;

import com.group.dto.request.CreateExpenditureRequestElasticDto;
import com.group.repository.entity.Expenditure;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-04T19:28:31+0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class IExpenditureMapperImpl implements IExpenditureMapper {

    @Override
    public Expenditure toExpenditure(CreateExpenditureRequestElasticDto dto) {
        if ( dto == null ) {
            return null;
        }

        Expenditure.ExpenditureBuilder<?, ?> expenditure = Expenditure.builder();

        expenditure.personalName( dto.getPersonalName() );
        expenditure.personalLastName( dto.getPersonalLastName() );
        expenditure.status( dto.getStatus() );
        expenditure.expenditureType( dto.getExpenditureType() );
        expenditure.amount( dto.getAmount() );
        expenditure.requestDate( dto.getRequestDate() );
        expenditure.confirmDate( dto.getConfirmDate() );
        expenditure.currency( dto.getCurrency() );
        expenditure.expendDetails( dto.getExpendDetails() );
        expenditure.personalId( dto.getPersonalId() );
        expenditure.expenditureRequestId( dto.getExpenditureRequestId() );

        return expenditure.build();
    }
}