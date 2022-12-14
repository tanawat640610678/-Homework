
// Admin.java
public class Admin extends User {

    public void doSomething() {
        System.out.println("Hello admin "+this.getName()+"!");
      }

      public void doSomething(int n) {
       for(int i = 0 ; i < n ; i++ ){
        super.doSomething();
       }
      }
     
      public void doExtra(){
        if(LocalDate.now().equals(this.birthday())){
          System.out.println("Happy birthday Admin!");
        }
      }

}
  