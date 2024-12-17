package com.talentbridge.hirewise.personnel_system.service;

import com.talentbridge.hirewise.personnel_system.dao.DepartmentDAO;
import com.talentbridge.hirewise.personnel_system.model.Department;
import java.util.List;

/**
 *
 * @author zahid
 */
public class DepartmentService {
    private DepartmentDAO departmentDAO = new DepartmentDAO();

    public List<Department> getAllDepartments() {
        return departmentDAO.findAll();
    }

    public void addDepartment(String name, String description) {
        // Örneğin basit bir iş kuralı: name boş değilse ekle
        if (name != null && !name.trim().isEmpty()) {
            Department dept = new Department(name, description);
            departmentDAO.insert(dept);
        } else {
            System.out.println("Department name is invalid");
        }
    }

    public void updateDepartment(int id, String newName, String newDesc) {
        Department dept = departmentDAO.findById(id);
        if (dept != null) {
            dept.setDepartmentName(newName);
            dept.setDepartmentDescription(newDesc);
            departmentDAO.update(dept);
        }
    }

    public void deleteDepartment(int id) {
        departmentDAO.delete(id);
    }
    
}