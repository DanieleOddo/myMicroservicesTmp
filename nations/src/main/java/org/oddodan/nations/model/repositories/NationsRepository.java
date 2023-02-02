package org.oddodan.nations.model.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.oddodan.nations.model.entities.Nations;

@Repository
public interface NationsRepository extends JpaRepository<Nations, Long> {

}
