package com.caplan.site.repository;

import com.caplan.site.model.Paint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaintRepository extends JpaRepository<Paint,Long> {
}
