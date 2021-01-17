package com.Emart.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Emart.Models.CategoryMaster;
import com.Emart.Models.User;

@Repository
public interface CategoryMasterRepository extends JpaRepository<CategoryMaster,Long> 
{

}
