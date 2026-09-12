class Applicant{
    static int totalapplicant=0;
    Applicant(){
        totalapplicant++;
    }
    public static void main(){
        Applicant a1=new Applicant();
        Applicant a2=new Applicant();
        Applicant a3=new Applicant();
    
        System.out.print("Total Applicants : "+Applicant.totalapplicant);
    }
}