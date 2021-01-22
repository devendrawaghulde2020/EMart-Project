package com.Emart.DAOs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Emart.Models.CategoryMaster;

@Repository
public interface CategoryMasterRepository extends JpaRepository<CategoryMaster,Long> 
{
	@Query("from CategoryMaster cm where cm.subCategoryId=NULL")
	public List<CategoryMaster> findAllCategories();
	
	@Query("from CategoryMaster cm where cm.categoryId=?1")
	public List<CategoryMaster> findByCategoryId(String id);
//from CategoryMaster cm where cm.categoryId=id?1	
}
