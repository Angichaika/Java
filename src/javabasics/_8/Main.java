package javabasics._8;

public class Main {
    public static void main(String[] args) {
        //Try to solve on paper the following boolean algebra operations:
        //[A]: 2 <= 2 && !true
        boolean a = 2 <= 2 && !true;
        System.out.println(a);
        //Il caso [A] dà come risultato "false", dato che 2 <= 2 risulta vero, !true risulta falso,
        //e l'operatore logico && restituisce vero solo se le entrambe le condizioni sono vere.

        //[B]: !false && 3 > 2
        boolean b = !false && 3 >2;
                System.out.println(b);
        //Il caso [B] dà come risultato "true", siccome "!false" è true, e 3 > 2 anche, perchè 3 è maggiore di 2
        //le due condizioni vere restituiscono "true".

        //[C]: considering that t=false and f=true: !(!t || f)
        boolean t= false;
        boolean f= true;
        boolean c = !(!t || f);
        System.out.println(c);
        //Il caso [C] dà come risultato "false" siccome loperatore OR restituisce "true" solo se almeno una delle due
        //condizioni è vera. "!t" diventa true; f= true; "!" davanti a tutto, negazione, diventa false e false.

        //[D]: 6 > 6 ^ !(true && true)
        boolean d = 6 > 6 ^ !(true && true);
        System.out.println(d);
        //Il caso [D] dà come risultato "false", siccome l'operatore logico XOR restituisce "true" solo nel caso in cui
        //una delle due condizioni è vera. In questo caso abbiamo 6 > 6 (false) e !(true $$ true) (false).
    }
}
