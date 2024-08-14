#include <stdlib.h>
#include <stdio.h>
#include "prototype.h"



int main(){
    printf("Rectangle de largeur 5 et hauteur 10. Aire = %f\n", aireRectangle(5, 10));
    printf("Rectangle de largeur 2.5 et hauteur 3.5. Aire = %f\n", aireRectangle(2.5, 3.5));
    printf("Rectangle de largeur 4.2 et hauteur 9.7. Aire = %f\n", aireRectangle(4.2, 9.7));
    return 0;

    printf("%d", tableDeMultiplication(10));
}

double aireRectangle(double largeur, double hauteur){
    return largeur * hauteur;
}



