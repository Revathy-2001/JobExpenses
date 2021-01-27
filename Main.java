import java.util.*;
class Main{
  public static void main(String[] args){
  Scanner kbd = new Scanner(System.in);
  int n = kbd.nextInt();
  int cnt = 0;
  int totexp = 0;

  int a[] = new int[n];
  for(int i = 0;i < n;i++){
    a[i] = kbd.nextInt();
  }

  for(int i = 0;i < n;i++){
      if(a[i] < 0){
        totexp = totexp + a[i];
      }
    }
  System.out.println(totexp*-1);
  
  }
}