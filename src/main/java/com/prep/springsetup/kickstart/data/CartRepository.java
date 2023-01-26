package com.prep.springsetup.kickstart.data;

import com.prep.springsetup.kickstart.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
}
