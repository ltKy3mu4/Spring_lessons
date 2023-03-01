package ru.mpei.demo.repository;

import org.springframework.stereotype.Repository;
import ru.mpei.demo.model.Equipment;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class EquipmentRepoImpl implements EquipmentRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Equipment e) {
        if (e.getId() == 0){
            em.persist(e);
        } else {
            em.merge(e);
        }
    }

    @Override
    public boolean delete(long id) {
        int count = em.createQuery("delete from Equipment e where e.id = :eqId")
                .setParameter("eqId", id)
                .executeUpdate();
        return count == 1;
    }

    @Override
    public Equipment getWithMeasurements(long id) {
        Equipment equipment = em.find(Equipment.class, id);

        return equipment;
    }

    @Override
    public Equipment get(long id) {
        return null;
    }
}
