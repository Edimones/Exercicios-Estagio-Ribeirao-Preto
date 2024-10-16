public class Main
{
    
       static long Fibonacci (long num) {
        int numAtual = 0;     
        int numAnt = 0;   
 
        for (int i = 1; i <= num; i++) {

            if (i == 1) {
                numAtual = 1;
                numAnt = 0;
            } else {
                numAtual += numAnt ;
                numAnt  = numAtual - numAnt ;
            }

        }
        
        return numAtual;
    }
        
   
    public static void main(String[] args) {
         int number = 21; //Entrada para o numero
         long[] vetor = new long[30]; 
         boolean isNumber = false;
         
         for (int i = 0; i < 30; i++){
            System.out.println(Fibonacci(i));
            vetor[i] = Fibonacci (i);
          
           if(vetor[i] == number){
                isNumber = true;
            }
         }
        
          if(isNumber){
                 System.out.println("Pertence a Sequência");
          }else{
                 System.out.println("Não Pertence a Sequência");
          }
       
        }
    }
