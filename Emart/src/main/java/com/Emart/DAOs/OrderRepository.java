package com.Emart.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Emart.Models.Orders;
import com.Emart.Models.User;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Long>
{

}
