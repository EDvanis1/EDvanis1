#include <stdio.h>
#include <stdlib.h>

/*int main(int argc, char *argv[]){
    int nombreDeVie = 5;
    int noteDeMath;
    double sommeArgentRecue;
    unsigned int nombreDeLecteursEnTrainDeLireUnLivre;
    int moi, toi, elle, lui, nous, vous;
    const int CONSTANTE = 5;
    printf("Il vous reste %d vie", nombreDeVie);
}*/
int main(){
    int nombreDevies = 5, niveau = 1; //Au départ, le joueur a 5 vies
    printf("Vous avez %d vies\n", nombreDevies);
    printf("Vous avez %d vies et vous êtes au niveau n°%d\n", nombreDevies, niveau);
    printf("*** B A M ***\n");// Là il se prend un grand coup sur la tête
    nombreDevies = 4;// Il vient de perdre une vie !
    printf("Ah desolé, il ne vous reste plus que %d vies maintenant !\n\n", nombreDevies);

    int age = 0;
    scanf("%d", &age);
    return 0;
}
