package io.bootify.amenity_reservation.repos;

import io.bootify.amenity_reservation.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
