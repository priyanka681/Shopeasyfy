package com.shopeasyfy.admin.user;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shopeasyfy.entity.Role;

//import com.shopeasyfy.entity.Role;
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

}
