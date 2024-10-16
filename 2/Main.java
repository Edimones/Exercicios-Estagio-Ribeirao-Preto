public class Main{
    public static void main(String[] args) {                                              
    

 int num = 0;
 
 String palavra = "Deus é amor, Amém";
int tamanho = palavra.length();

 
 for (int i = 0; i < tamanho; i++) {
     if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A') {
     num++;     
}

 }

System.out.println(num);

}
 
    }
