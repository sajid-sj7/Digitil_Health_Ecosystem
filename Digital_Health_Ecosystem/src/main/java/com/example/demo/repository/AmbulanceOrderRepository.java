package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.AmbulanceOrder;

@Transactional
@Repository
public interface AmbulanceOrderRepository extends JpaRepository<AmbulanceOrder, Integer> {



	

	// for ambulanace dashbord to get all orders--------------
	@Query(value = "select * from ambulanceorder ao where ao.order_status=:order_status and ao.aprove_status=:aprove_status and ao.aid=:aid", nativeQuery = true)
	public List<AmbulanceOrder> getAllOrders(int aid, int order_status, int aprove_status);

	// for accepting oeder from ambulance owner/dashbord
	@Modifying(clearAutomatically = true)
	@Query("update AmbulanceOrder ao set ao.aprove_status=:aprove_status where aoid=:aoid")
	public int updateOrderStatus(int aoid, int aprove_status);



}
