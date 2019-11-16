package com.laptrinhjavaweb.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import com.laptrinhjavaweb.buider.BuildingSeachBuilder;
import com.laptrinhjavaweb.converter.BuildingConverter;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.paging.Pageable;
import com.laptrinhjavaweb.repository.IBuildingRepository;
import com.laptrinhjavaweb.repository.impl.BuildingRepository;
import com.laptrinhjavaweb.service.IBuildingservice;

public class BuildingService implements IBuildingservice {
	private IBuildingRepository buildingRepository;
	private BuildingConverter buildingConverter;
	public BuildingService() {
		buildingRepository = (IBuildingRepository) new BuildingRepository();
		buildingConverter = new BuildingConverter();
	}	

	@Override
	public List<BuildingDTO> findAll(BuildingSeachBuilder filedSearch,Pageable pageable) {
		// java 7
//		List<BuildingDTO> result=new ArrayList<BuildingDTO>();
//		List<BuildingEntity>buildingEntities=buildingRepository.findAll();
//		for (BuildingEntity item: buildingEntities) {
//			BuildingDTO buildingDTO=buildingConverter.convertToDTO(item);
//			result.add(buildingDTO);
//		}
//		return result;
		// java 8
		Map<String, Object> properties =new HashMap<>();
		properties.put("name", filedSearch.getName());
		properties.put("district", filedSearch.getDistrict());
		if(StringUtils.isNotBlank( filedSearch.getBuildingArea())) {
			properties.put("buildingArea",Integer.parseInt(filedSearch.getBuildingArea()));
		}
		if(StringUtils.isNotBlank( filedSearch.getNumberOfBasement())) {
			properties.put("numberOfBasement", Integer.parseInt(filedSearch.getNumberOfBasement()));
		}
		
		
		
		//List<BuildingEntity> buildingEntities= buildingRepository.findAll(properties,pageable);
		List<BuildingEntity> buildingEntities= buildingRepository.findAll(properties);
		return buildingEntities.stream()
				.map(item -> buildingConverter.convertToDTO(item)).collect(Collectors.toList());
	}
}
