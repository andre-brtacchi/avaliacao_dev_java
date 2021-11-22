/*
*
*                   André Rodrigues Bertacchi - Global Hitss IA
*
*                   script: Ordena Array              2021.11.22
*
*                   Recebe dez números inteiros, os ordena de forma crescente e depois imprime cada um dos elementos do array
*
*
* */
package andreAvaliacao
import java.util.Scanner;
public class OrdenaArray{
	 public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Digite dez números: ");

        Integer[] vetor={null,null,null,null,null,null,null,null,null,null};
        int n = vetor.length;

        for(int i=0;i<n;i++){
            int num=scan.nextInt();
            vetor[i]=num;
        }

        for (int i = 1; i < n; ++i) {
            int temp = vetor[i];
            int j = i - 1;


            while (j >= 0 && vetor[j] > temp) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = temp;
        }
        for(int i=0;i<n;i++){
            if(i==0) System.out.print("{"+vetor[i]);
            else if(i<n-1) System.out.print(", "+vetor[i]);
            else System.out.println(", "+vetor[i]+"}");
        }
    }	
}