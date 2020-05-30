package jpabook.jpashop;

import jpabook.jpashop.domain.Locker;
import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        try{
/*            Locker newLocker = new Locker();
            entityManager.persist(newLocker);*/

            Member findMember = entityManager.find(Member.class, 4L);

            /*findMember.setLocker(newLocker);*/
/*            Team teamA = new Team();
            teamA.setName("TEAM A");
            entityManager.persist(teamA);
            Team teamB = new Team();
            teamB.setName("TEAM B");
            entityManager.persist(teamB);

            Member memberA = new Member();
            memberA.setUsername("유진곤");
            memberA.setTeam(teamA);
            Member memberB = new Member();
            memberB.setUsername("유신일");
            memberB.setTeam(teamA);
            Member memberC = new Member();
            memberC.setUsername("유재광");
            memberC.setTeam(teamB);
            entityManager.persist(memberA);
            entityManager.persist(memberB);
            entityManager.persist(memberC);*/
            //Member memberFind = entityManager.find(Member.class, 2L);
/*            Member member = entityManager.find(Member.class, 1L);
            //Member findMember = entityManager.find(Member.class, 1L);
            List<Member> result = entityManager.createQuery("select m from Member as m", Member.class)
                .getResultList();*/

            //Member member = entityManager.find(Member.class, 3L);
            //Team team = entityManager.find(Team.class, 1L);
            tx.commit();
        }catch(Exception e) {
            tx.rollback();
        }finally{
            entityManager.close();
        }

        entityManagerFactory.close();
    }
}