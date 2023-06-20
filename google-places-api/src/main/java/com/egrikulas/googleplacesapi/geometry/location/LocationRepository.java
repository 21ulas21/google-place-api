package com.egrikulas.googleplacesapi.geometry.location;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, String> {
}
