public class HelloWorld{
     public static void main(String[] args) {
       while(true) {
        System.out.println("hello world");
        try {
          Thread.sleep(5000);
         } catch(Exception e){
            e.printStackTrace();
         
        }
     }
   }
}
