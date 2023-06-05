package com.meetingplanner.repositories;

import com.meetingplanner.entities.Locale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocaleRepository extends JpaRepository<Locale, Long> {
}
