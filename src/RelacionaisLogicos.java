public class RelacionaisLogicos {
    public static void main(String[] args){
        //Operadores relacionais
        //<, >, <=, >=, !=, == e =

        //Testando igualdade
        int num1, num2;
        num1 = 10;
        num2 = 10;

        if(num1 == num2){
            System.out.println("num1 e num2 são iguais");
        }else{
            System.out.println("num1 e num2 não são iguais");
        }

        //testando desigualdade
        int num3, num4;
        num3 = 10;
        num4 = 20;

        if(num3 == num4){
            System.out.println("num3 e num4 não são iguais");
        }else{
            System.out.println("num3 e num4 são diferentes");
        }

        //testando maior
        int num5, num6;
        num5 = 20;
        num6 = 10;

        if(num5 > num6){
            System.out.println("num5 é maior num6");
        }else{
            System.out.println("num5 não é maior num6");
        }

        //Operadores Lógicos
        //&& = e ou AND, || = ou OR
        int num7 = 10;
        int  num8 = 5;
        int num9 = 20;
        int num10 = 5;

        if((num7 > num9) && (num8 == num10)){
            System.out.println("Primeira opção satisfeita");
        }else{
            System.out.println("Segunda opção satisfeita");
        }

        int num11 = 20;
        int num12 = 5;
        int num13 = 10;
        int num14 = 5;

        if((num11 > num13) || (num12 != num14)){
            System.out.println("Primeira opção satisfeita");
        }else{
            System.out.println("Segunda opção satisfeita");
        }
    }
}
