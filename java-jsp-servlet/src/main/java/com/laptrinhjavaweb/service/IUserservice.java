
package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.buider.BuildingSeachBuilder;
import com.laptrinhjavaweb.dto.UserDTO;

public interface IUserservice {
	List<UserDTO> findAll(BuildingSeachBuilder fieldSearch,int offset,int limmit);
}
