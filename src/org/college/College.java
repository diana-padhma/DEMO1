package org.college;

public class College {
	public void collegeName() {
		System.out.println("College Name is : Tagore College of Art And Sciences");
	}
	public void collegecode() {
		System.out.println("Collage Code is : 22920CR34");
}
	public void collegeRank() {
		System.out.println("Collage Rank : 1st Rank");
	}
	public static void main (String[] args) {
		College c = new College();
		Student s = new Student();
		Hostel h = new Hostel();
		Dept d = new Dept();
		
		c.collegeName();
		c.collegecode();
		c.collegeRank();
		s.studentName();
		s.studentDept();
		s.studentId();
		h.hostelName();
		d.deptName();
		System.out.println("hello");
	}
	

}
