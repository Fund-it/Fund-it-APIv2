package com.fundit.platform.booking.mapping;

import com.fundit.platform.booking.domain.model.EventPayment;
import com.fundit.platform.booking.resource.CreateEventPaymentResource;
import com.fundit.platform.booking.resource.EventPaymentResource;
import com.fundit.platform.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class EventPaymentMapper implements Serializable {

    @Autowired
    private EnhancedModelMapper mapper;

    public EventPaymentResource toResource(EventPayment model){

        return mapper.map(model,EventPaymentResource.class);
    }

    public Page<EventPaymentResource> modelListPage(List<EventPayment>modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList,EventPaymentResource.class),pageable, modelList.size());
    }

    public EventPayment toModel(CreateEventPaymentResource resource){ return mapper.map(resource,EventPayment.class); }












}
