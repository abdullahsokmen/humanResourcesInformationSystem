package com.group.dto.Advancepaymentdto.response;

import com.group.repository.entity.enums.Currency;
import com.group.repository.entity.enums.EAdvancePaymentType;
import com.group.repository.entity.enums.EStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdvancePaymentResponseDto {
    private Long id;
    private Date requestDate;
    private Date confirmDate;
    private String currency;
    private Double amount;
    private String advanceDetails;
    private String advancePaymentType;
    private String status;
}