package com.tectes.OneToOneMappingEx;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface TutorialDetailsRepository extends JpaRepository<TutorialDetails, Long>
{
    @Transactional
    void  deleteById(long id);
    @Transactional
    void deleteByTutorialId(long tutorialId);
}
