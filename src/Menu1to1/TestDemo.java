package Menu1to1;

public class TestDemo{
	public static void main(String args[]){
		Menu1to1.School sch = new Menu1to1.School("清华大学") ;	// 定义学校
		Menu1to1.Student s1 = new Menu1to1.Student("张三",21) ;
		Menu1to1.Student s2 = new Menu1to1.Student("李四",22) ;
		Menu1to1.Student s3 = new Menu1to1.Student("王五",23) ;
		sch.getAllStudents().add(s1) ;
		sch.getAllStudents().add(s2) ;
		sch.getAllStudents().add(s3) ;
		s1.setSchool(sch) ;
		s2.setSchool(sch) ;
		s3.setSchool(sch) ;
		System.out.println(sch) ;
		/*Iterator<Student> iter = sch.getAllStudents().iterator() ;
		while(iter.hasNext()){
			System.out.println("\t|- " + iter.next()) ;
		}
		*/
		for(int i=0;i< sch.getAllStudents().size();i++){
			System.out.println("\t|- " + sch.getAllStudents().get(i)) ;
		}
	}
};