package io.bootify.amenity_reservation.repos;

import io.bootify.amenity_reservation.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
