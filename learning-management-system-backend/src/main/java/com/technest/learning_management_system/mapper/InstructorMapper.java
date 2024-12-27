package com.technest.learning_management_system.mapper;

import com.technest.learning_management_system.dto.InstructorDTO;
import com.technest.learning_management_system.entity.Instructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class InstructorMapper {

    public InstructorDTO fromInstructor(Instructor instructor) {
        InstructorDTO instructorDTO = new InstructorDTO();
        BeanUtils.copyProperties(instructor, instructorDTO);
//        instructorDTO.setUser(fromUser(instructor.getUser()));
        return instructorDTO;
    }

    public Instructor fromInstructorDTO(InstructorDTO instructorDTO) {
        Instructor instructor = new Instructor();
        BeanUtils.copyProperties(instructorDTO, instructor);
        return instructor;
    }
}
