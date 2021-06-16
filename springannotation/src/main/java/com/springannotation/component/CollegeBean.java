package com.springannotation.component;

public class CollegeBean {
	
	private Principal principal;
	private Teacher teacher;
	//DI using contructor
/*	public CollegeBean(Principal principal) {
		super();
		this.principal = principal;
		System.out.println("using constructor DI");
	}
*/
	
	//DI using setter method
		public void setPrincipal(Principal principal) {
			this.principal=principal;
			System.out.println("using settter method");
		}
		
		public void setTeacher(Teacher teacher) {
			this.teacher=teacher;
			System.out.println("using settter method");
		}

	public void test() {
		System.out.println("test() is called for collegebean class");
		principal.principalInfo();
		teacher.teach();
	}
}
