package homework_16.mainApp;

import java.util.List;

public class StudentDaoImpl implements StudentDao<Student> {
	
	private  List<Student> listOfStudent;


	@Override
	public List readAll() {
	
		return listOfStudent;
	}

	@Override
	public Student create() {
		Student st = new Student();
		st.setAge(2);
		st.setId(2);
		st.setName("234234");
		listOfStudent.add(st);
		return (Student) listOfStudent;
	}

	@Override
	public Student read(Integer id) {
		return listOfStudent.get(id);
	}

	@Override
	public Student update(Student t) {
		throw new IllegalStateException("there is no update for bucket");
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	

}
