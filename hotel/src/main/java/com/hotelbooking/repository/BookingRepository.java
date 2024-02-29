package com.hotelbooking.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelbooking.entity.BookedRoom;



public interface BookingRepository extends JpaRepository<BookedRoom, Long>{

	Optional<BookedRoom> findByBookingConfirmationCode(String bookingConfirmationCode);

    List<BookedRoom> findByRoomId(Long roomId);

	List<BookedRoom> findByGuestEmail(String email);
}
