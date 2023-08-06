function validacion(arreglo, numero){
let val=0
for(const i of arreglo){//esta opcion dentro de for es solamente para arreglos en una variable cualquiera seria for (let i=0,i..5 )
    if(arreglo[i]==numero) val++
}
return val
}
function into_val(){
let valor=prompt("introduce el valor para verificar","")

//if (valor!=Number) alert("ERROR")
return valor

}

function arrays(){
    let arreglo = [1,2,3,4,5,6]
    return arreglo
}

let valor1=into_val()
let valor2=into_val()
let array=arrays()
let val1=validacion(array,valor1)
let val2=validacion(array,valor2)

if (val1 != 0) alert("El valor "+valor1+" se repite "+val1+" veces");
else alert("El valor "+ valor1 +" no se aparece en la lista")

if (val2 != 0) alert("El valor "+valor2+" se repite "+val2+" veces");
else alert("El valor "+ valor2 +" no se aparece en la lista")





