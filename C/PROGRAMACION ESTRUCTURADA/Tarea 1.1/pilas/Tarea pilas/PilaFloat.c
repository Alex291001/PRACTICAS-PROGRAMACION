//Tarea 1.1  Pila Flotante  Alexis Zosimo Antonio Angel  202-B
#include <stdio.h>
#include "pilaFloat.h"

void printPila(TPila p)
{
   float elem;
   
    printf("Tope");
	while(pilaVacia(p) != 1){
        pop(&p, &elem);
		printf("==>%f ",elem);
	}
   printf("\n");
}

main()
{
    TPila p;
    float e;

    if (initPila(&p, 3) == 1){
        printf("Se creo la pila correctamente\n\n");
        printf("Inserta %f\n",3.0);
		push(&p, 3);         printPila(p);
		printf("Inserta %f\n",5.0);
        push(&p, 5);         printPila(p);
        printf("Inserta %f\n",7.0);
        push(&p, 7);         printPila(p);
        printf("Inserta %f\n",9.0);
        push(&p, 9);	    

        topePila(p, &e);
        printf("\nelemento del tope %d\n",e);
        printPila(p);
        
        printf("\nElimina de la Pila\n");
        pop(&p, &e);         printPila(p);
        printf("Elimina de la Pila\n");
        pop(&p, &e);         printPila(p);
        printf("Elimina de la Pila\n");
        pop(&p, &e);         printPila(p);
        printf("Elimina de la Pila\n");
        pop(&p, &e);		

        liberaPila(&p);
    }
    else{
        printf("memoria Insuficiente\n");
    }

    getchar();
    return 0;
}
