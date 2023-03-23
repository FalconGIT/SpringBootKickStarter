package com.prep.springsetup.kickstart.repository;

import com.prep.springsetup.kickstart.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
}
