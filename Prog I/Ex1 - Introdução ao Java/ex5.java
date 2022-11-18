public class ex5{
    public static void main (String[] args) {
        int i;
        int y;
        for(i=1; i<=100; i++){
            if(i==1){
                System.out.println("1 Java atrapalha muita gente\n");
            }else{
              System.out.print(i + " Java ");
              for(y=1;y<=i;y++){
                System.out.print("atrapalham ");
              }
              System.out.println("muita gente"); 
            }
        }



    }

}