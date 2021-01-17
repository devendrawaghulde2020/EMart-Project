package com.Emart.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Emart.Models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>
{
	public User save(User user);
	
	@Query("From User Where email_id=?1 AND password=?2")
	public User login(String emailId, String password);
}
