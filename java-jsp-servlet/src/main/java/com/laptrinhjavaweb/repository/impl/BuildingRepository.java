package com.laptrinhjavaweb.repository.impl;

import java.util.List;
import java.util.Map;

import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.paging.Pageable;
import com.laptrinhjavaweb.repository.IBuildingRepository;

public class BuildingRepository extends SimpleJpaRepository<BuildingEntity> implements IBuildingRepository {

//	@Override
//	public List<BuildingEntity> findAll(Map<String, Object> params, Pageable pageable) {
//		//StringBuilder where = new StringBuilder(" ");
//
//		/*
//		 * Code Hoc Sinh String name =(String) params.get("name"); String district
//		 * =(String) params.get("district");
//		 * 
//		 * 
//		 * if(StringUtils.isNotBlank(name)) { where.append(" AND A.name LIKE '%"+
//		 * name+"%' "); } if(StringUtils.isNotBlank(district)) {
//		 * where.append(" AND A.district LIKE '%"+ district+"%' "); }
//		 * if(params.get("buildingArea")!=null) { Integer buildingArea =(Integer)
//		 * params.get("buildingArea");
//		 * where.append(" AND A.buildingArea="+buildingArea+" ");
//		 * 
//		 * } if(params.get("numberOfBasement")!=null) { Integer numberOfBasement
//		 * =(Integer) params.get("numberOfBasement");
//		 * where.append(" AND A.numberOfBasement="+numberOfBasement+" ");
//		 * 
//		 * } // StringBuilder where = new
//		 * StringBuilder(" AND A.name LIKE '%"+name+"%' AND A.district LIKE '%"+district
//		 * +"%'"); //
//		 * where.append(" and A.buildingArea ="+buildingArea+" AND A.numberOfBasement ="
//		 * +numberOfBasement+"");
//		 */
//
//		// Code 2nam exp
////		if (params != null && params.size() > 0) {
////			String[] keys = new String[params.size()];
////			Object[] value = new Object[params.size()];
////			int i = 0;
////			for (Map.Entry<String, Object> item : params.entrySet()) {
////				keys[i] = item.getKey();
////				value[i] = item.getValue();
////				i++;
////			}
////			for (int i1 = 0; i1 < keys.length; i1++) {
////				if ((value[i1] instanceof String) && (StringUtils.isNoneBlank(value[i1].toString()))) {
////					where.append(" AND LOWER(A." + keys[i1] + ") LIKE '%" + value[i1].toString() + "%' ");
////				}
////				if ((value[i1] instanceof Integer) && (value[i1] != null)) {
////					where.append(" AND LOWER(A." + keys[i1] + ") =" + value[i1] + " ");
////
////				}
////				if ((value[i1] instanceof Long) && (value[i1] != null)) {
////					where.append(" AND LOWER(A." + keys[i1] + ") =" + value[i1] + " ");
////
////				}
////
////			}
////
////		}
//		//return this.findAll(pageable, where.toString());
//			return this.findAll(params, pageable);
//	}

}
