package com.ziio.backend.repository;

import com.ziio.backend.entity.MyPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MyPageRepository extends JpaRepository<MyPage, Long> {

    // 사용자의 이메일과 학사일정 id를 기준으로 개수를 카운트하는 메소드
    @Query("SELECT COUNT(mp) FROM MyPage mp WHERE mp.user_email = :userEmail AND mp.academic_id = :academicId")
    long countByUserEmailAndAcademicId(@Param("userEmail") String userEmail, @Param("academicId") Long academicId);
}