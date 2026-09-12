class Course {
 String code;
 String title;
 Course(String code,String title){
    this.code=code;
    this.title=title;
 }
 public static void main(){
    Course c1=new Course("21CSC201J","Data Structures");
    System.out.print(c1.code+" - "+c1.title);
 }
}