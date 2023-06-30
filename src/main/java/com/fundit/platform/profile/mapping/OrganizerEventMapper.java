package com.fundit.platform.profile.mapping;

import com.fundit.platform.profile.domain.model.OrganizerEvent;
import com.fundit.platform.profile.resource.CreateOrganizerEventResource;
import com.fundit.platform.profile.resource.OrganizerEventResource;
import com.fundit.platform.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class OrganizerEventMapper implements Serializable {

    @Autowired
    private EnhancedModelMapper mapper;

    public OrganizerEventResource toResource(OrganizerEvent model){
        return mapper.map(model,OrganizerEventResource.class);
    }

    public Page<OrganizerEventResource> modelListPage(List<OrganizerEvent> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList,OrganizerEventResource.class),pageable, modelList.size());
    }

    public OrganizerEvent toModel(CreateOrganizerEventResource resource){ return mapper.map(resource,OrganizerEvent.class); }

}
