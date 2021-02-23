import java.util.Scanner;
public class first{
    public static void main(String arga[])
    {
         Menu(); 

    }
    public static void Menu(){
        int num1,i=10;
            Scanner num = new Scanner(System.in);
           while(i>=10)
           {
                System.out.println("\n01.Register\n02.contact \n03.feedback\n04.hotline\n");
                System.out.print("enter number = "); 
                num1=num.nextInt();
                if(num1==1){
                    Register();
                    i=2;
                }
                else if(num1==2){
                     contact();
                      i=2;
                }
                else if(num1==3){
                     feedback();
                      i=2;
                }
                else if(num1==4){
                     hotline();
                      i=2;
                }
                else{
                   System.out.println("\n!! error number  enter again !!\n \n");
                    i=20;
                }
              
            }
    }
     public static void Register(){
        String name,id,tel,degree,year;
        int n1;
        Scanner name1 = new Scanner(System.in);

        System.out.print("\n\nenter Name = ");
        name=name1.nextLine();
        
        System.out.print("enter id number = ");
        id=name1.nextLine();
        
        System.out.print("enter tel = ");
        tel=name1.nextLine();
        
        System.out.print("enter degree = ");
        degree=name1.nextLine();
        
        System.out.print("enter year = ");
        year=name1.nextLine();

        System.out.print("\nSucssesfully Registered "+name);
        System.out.println("\n\n01.do you want to go main menu\n02.end this menu");
         System.out.print("enter number = ");
        n1=name1.nextInt(); 
        if(n1==1){
            Menu();
        }
        else{
             System.out.print("\n\nHAVE A NICE DAY\n\n");
        }

     }
     public static void contact(){

         int n1;
        Scanner num = new Scanner(System.in);
        System.out.println("\n\n01.support servise=\tsupport@my.sliit.lk\n02.it servise=\t\titsuport@gmail.com \n03.head offece=\t\tsliithead@gmail.com\n04.hotline=\t\tsliithot@my.sliit.lk");
        System.out.println("\n\n01.do you want to go main menu\n02.end this menu");
        System.out.print("enter number = ");
        n1=num.nextInt(); 
        if(n1==1){
            Menu();
        }
        else{
             System.out.print("\n\nHAVE A NICE DAY\n\n");
        }
     }
     public static void feedback(){
        String feedback;
        int n1;
        Scanner fe =new Scanner(System.in);
         System.out.print("\nType your feedback =");
         feedback=fe.nextLine();
         System.out.print("\nthanks for your feedback ");

        System.out.println("\n\n01.do you want to go main menu\n02.end this menu");
        System.out.print("enter number = ");
        n1=fe.nextInt(); 
        if(n1==1){
            Menu();
        }
        else{
             System.out.print("\n\nHAVE A NICE DAY\n\n");
        }

     }
    public static void  hotline(){
        int n1;
        Scanner num = new Scanner(System.in);
        System.out.println("\n\n01.support servise=\t0768946123\n02.it servise=\t\t0751656789 \n03.head offece=\t\t011624982\n04.hotline=\t\t1781");
        System.out.println("\n\n01.do you want to go main menu\n02.end this menu");
        System.out.print("enter ferst number = ");
        n1=num.nextInt(); 
        if(n1==1){
            Menu();
        }
        else{
             System.out.print("\n\nHAVE A NICE DAY\n\n");
        }
    }
}