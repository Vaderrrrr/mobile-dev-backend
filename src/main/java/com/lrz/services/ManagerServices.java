package com.lrz.services;

import com.lrz.dao.ManagerDao;
import com.lrz.model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
@Service
public class ManagerServices {

    @Autowired
    private ManagerDao managerDao;

    /* Test for Connection*/
    public String manager() {
        return "Manager connected!";
    }

    /* Create New Manager */
    public void managerCreate(Manager manager) {
        managerDao.save(manager);
    }

    /* Delete Manager by Id */
    public void managerDelete(Integer managerId) {
        managerDao.deleteById(managerId);
    }

    /* Select Manager by Id -------无效*/
    public Manager managerSelectId(Manager manager) {
        return managerDao.getOne(manager.getManagerId());
    }

    /* Select All Manager */
    public List<Manager> managerSelectAll() {
        return managerDao.findAll();
    }

    /* Update Manager Information */
    public void managerUpdate(Manager manager) {
        Manager managerNew = managerDao.getOne(manager.getManagerId());
        managerNew.setManagerName(manager.getManagerName());
        managerNew.setEmail(manager.getEmail());
        managerNew.setTelephoneNumber(manager.getTelephoneNumber());
        managerDao.save(managerNew);
    }

    /* Update Manager for Password */
    public void managerUpdatePassword(Manager manager) {
        Manager managerNew = managerDao.getOne(manager.getManagerId());
        managerNew.setPassword(manager.getPassword());
        managerDao.save(managerNew);
    }

    /* Update Manager for Name *
    public void managerUpdateName(Manager manager) {
        Manager managerOri = managerDao.getOne(manager.getManagerId());
        managerOri.setManagerName(manager.getManagerName());
        managerDao.save(managerOri);
    }

    /* Update Manager for Email *
    public void managerUpdateEmail(Manager manager) {
        Manager managerOri = managerDao.getOne(manager.getManagerId());
        managerOri.setEmail(manager.getEmail());
        managerDao.save(managerOri);
    }

    /* Update Manager for Telephone Number
    public void managerUpdateTel(Manager manager) {
        Manager managerOri = managerDao.getOne(manager.getManagerId());
        managerOri.setTelephoneNumber(manager.getTelephoneNumber());
        managerDao.save(managerOri);
    }
    */
    /* Select Manager by Name -------无效
    public Manager managerSelectName(Manager manager) {
        return managerDao.getByManagerName(manager.getManagerName());
    }
    */
}
