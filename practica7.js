//Practica 7 crear un programa que me diga si un numero es primo o no


function NumeroPrimo(n,dis){
/*
  if (dis==0||n%dis==0&&dis!=1){  Este es una manera de poder darle recursion a un valor para que nos de los numeros primos
   return dis}
  else
  {
    
  return NumeroPrimo(n,dis-1)}




*/
return dis==0||n%dis==0&&dis!=1? dis :NumeroPrimo(n,dis-1) //Este es la manera simplificada de hacerlo a traves de los retornos ternarios


}

function recursividad(RangoMin,RangoMax,acum){

    
    RangoMin++
   
const acumulador=RangoMin%2&&RangoMin%5!=1? (RangoMin+", "):("")

acum+=acumulador



return RangoMax==RangoMin ? acum :recursividad(RangoMin,RangoMax,acum)
}





let nPrimo=1
let acum=""
while(nPrimo<100){
nPrimo++
if((NumeroPrimo(nPrimo,nPrimo-1))==0){
    acum+=(nPrimo+" ")
}



}

console.log(acum)

//let n_primo= NumeroPrimo(nPrimo)?console.log("El numero es primo"):nPrimo==9?console.log("El numero no es primo"):console.log("El numero no es primo")

//Para hacerlo mas interesante haremos que se impriman todos los numero primo utilizando una funcion y ocupandola como una funcion recursiva




