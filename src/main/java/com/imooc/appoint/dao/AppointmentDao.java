package com.imooc.appoint.dao;

import com.imooc.appoint.entiy.Appointment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppointmentDao {
	//通过图书ID和学生ID预约书籍，并插入
	int insertAppointment(@Param("bookId") long bookId, @Param("studentId") long studentId);
	 
	//通过一个学生ID查询已经预约了哪些书。
	List<Appointment> quaryAndReturn(long studentId);
//	//查询所有已经预约书籍，暂时不开发管理员界面
//	List<Appointment> queryAll(@Param("offset") int offset,@Param("limit") int limit);
}
