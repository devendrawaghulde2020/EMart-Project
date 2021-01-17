package com.Emart.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Emart.Models.ShippingAddress;
import com.Emart.Models.User;

@Repository
public interface ShippingAddressRepository extends JpaRepository<ShippingAddress,Long>
{

}
