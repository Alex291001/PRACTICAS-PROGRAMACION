
// En este proyecto tendremos  se practicara el uso de clases y tambien al uso de array mapas para poder tener un formulario bien estructurado, asi como de condicionadores y switch
/*
Debera de estar estructurado de tal manera que sea facil para el usuario poder interactuar con ella  (ULTIMO EN HACER)

Area y perimetro del circulo, cuadrado, triangulo, rectuangulo paralelogramo, trapezoide               (ESTARA EN LA CLASE OPERACION DENTRO DE UN METODO)
Algunas formulas de trigonometria como el teorema de Pitagoras, la altura y area de un triangulo equilatero
formulas del circulo sector circular, corona cirular, elipse
el area y volumen de algunas figuras




*/

class Formulas{//Datos de cualquier formula
constructor(names){
this._nombre_figura=names


}

get nombre(){
    return this._nombre_figura
}


get formulas2D(){
    
    let name;
    let s=true

    while(s){
        s=false
        name=prompt("De que figura deseas obtener su formula?\n\n 1)cuadrado  2)rectangulo 3)paralelogramo  4)trapezoide 5)circulo 6)triangulo  \n\n 0)SALIR","")
    switch((name)){
       
        case "1":
           // console.log("Aqui")
        this._nombre_figura="cuadrado"
        break
        case "2":
        this._nombre_figura="rectangulo"
        break
        case "3":
         this._nombre_figura="paralelogramo"
        break
        case "4":
        this._nombre_figura="trapezoide"
        break
        case "5":
         this._nombre_figura="circulo"
        break
        case "6":
         this._nombre_figura="triangulo"
        break
        case "0":
            alert("Has salido del programa")
            return
            break
        default:
            alert("HAS SELECCIONADO UN VALOR ERRONEO\n Intene nuevamente..")
            s=true
        break
    }

}
    return this._nombre_figura//este return le dara el nombre de la figura desde la clase formulas
}

get formulas3D(){
  
    let s=true

    let name
    while(s){
        s=false
        name=prompt("De que figura deseas obtener su formula?\n\n 1)paralelepipedo  2)esfera 3)cilindro  4)cono 5)tronco cono   \n\n 0)SALIR","")
    switch(name){
        case "1":
        this._nombre_figura="paralelepipedo"
        break
        case "2":
        this._nombre_figura="esfera"
        break
        case "3":
         this._nombre_figura="cilindro"
        break
        case "4":
        this._nombre_figura="cono"
        break
        case "5":
         this._nombre_figura="tronco cono"
        break
        case "0":
            alert("Has salido del programa")
            return
            break
        default:
            alert("HAS SELECCIONADO UN VALOR ERRONEO\n Intene nuevamente..")
            s=true
        break
        
    }
}
    return this._nombre_figura//este return le dara el nombre de la figura desde la clase formulas
}

get accion2d(){
        let name_accion
        let select
        
    switch(this._nombre_figura){
            case "cuadrado"||"rectangulo"||"paralelogramo"||"trapezoide":
            select="1"//aqui debe tener la opcion de seleccionar de acuerdo con el prompt de acuerdo a lo que el texto diga 
            
            switch(select){
                case "1":
                    
                name_accion="area"
                
                break

                case "2":
                name_accion="perimetro"
                break
            }
            break
            
            case "circulo":

                select="1"//aqui debe tener la opcion de seleccionar de acuerdo con el prompt de acuerdo a lo que el texto diga 
                switch(select){
                    case "1":
                    name_accion="area"
                    break
    
                    case "2":
                    name_accion="perimetro"
                    break
                    case "3":
                    name_accion="area sector circular"
                    break
                    case "4":
                    name_accion="lado sector circular"
                    break
                    case "5":
                    name_accion="corona circular"
                    break
                    case "6":
                    name_accion="elipse"
                    break
                }
             
            break
            case "triangulo":
                select="1"//aqui debe tener la opcion de seleccionar de acuerdo con el prompt de acuerdo a lo que el texto diga 
                switch(select){

                    case "1":
                    name_accion="area"
                    break
                    case "2":
                    name_accion="perimetro"
                    break
                    case "3":
                    name_accion="teorema de piragoras"
                    break
                    case "4":
                    name_accion="triangulo equilatero"
                    break
                }
            
            break
            
            


    }
    return name_accion
}

get accion3d(){

    let name_accion
    let select

switch(this._nombre_figura){
        case "paralelepipedo"||"esfera"||"cilindro":
        select="1"//aqui debe tener la opcion de seleccionar de acuerdo con el prompt de acuerdo a lo que el texto diga 

        switch(select){
            case "1":
            name_accion="area"
            break

            case "2":
            name_accion="volumen"
            break
        }
        
        case "cono":
            select="1"//aqui debe tener la opcion de seleccionar de acuerdo con el prompt de acuerdo a lo que el texto diga 

            switch(select){
                case "1":
                name_accion="area"
                break
    
                case "2":
                name_accion="volumen"
                break
                case "3":
                name_accion="altura cono"
                break


                }

        break

        case "tronco cono":
            name_accion="volumen"

        break
        }

        return name_accion
    }




}



class formulas2d extends Formulas{
    //gracias al constructor puedo llamar hacer varias acciones al momento de crear mi variable de este tipo de clase asi optimizando mas mi codigo
    constructor(nombre,accion,resultado){//cree un nuevo parametro de formula2d desde aqui dependiendo de los datos que se agreguen, te dara el resultado que buscas automaticamente
       super(nombre)
       this._accion=accion
        this._resultado=resultado
            console.log(this._accion)//desde aqui ya hago que mi propio codigo haga que se resuelva el resultado automaticamente desde el constructor esta puede 
            //hacer que la accion se realice al momento de crear una variable de tipo new clase(new formulas2d())
        switch(nombre){
            case "cuadrado":
                
            this._resultado=this.formula_cuadrado()//aqui llamo a la formula del cuadrado y el return sera el valor de _resultado
            
            break
            case "rectangulo":
            this._resultado=this.formula_rectangulo()
            break
            case "paralelogramo":
            this._resultado=this.formula_rectangulo()//aqui se uso la misma funcion ya que las formulas son practicamente las mismas
            break
            case "trapezoide":
            this._resultado=this.formula_trapezoide()
            break
            case "circulo":
            this._resultado=this.formula_circulo()
            break
            case "triangulo":
            this._resultado=this.formula_triangulo()
            break
            




        }

      
      
        
    }

    set accion(nueva_accion){
        this._accion=nueva_accion

        console.log(this._accion)

    }

    formula_cuadrado(){
        function area(){
            let lado=5
            
            return (Math.pow(parseInt(lado), 2))
            
        }
        function perimetro(){
            let lado=5

            return lado*4
        }
        
            switch(this._accion){

                case "area":
                    
                return area()
                break
                case "perimetro":
                return perimetro()
                break
            }


    }
    

    formula_rectangulo(){
        function area(){
            let base,altura;
            base=5
            altura=3

            return base*altura


            
        }
        function perimetro(){

            let l1,l2;
            l1=4
            l2=5

            return (2*(l1))+(2*(l2))
        }

        switch(this._accion){

            case "area":
                
            return area()
            break
            case "perimetro":
            return perimetro()
            break
        }


    }

  

    formula_trapezoide(){
        function area(){

            let a,b,h 
                a= 5//lado mas pequeño del trapezoide
                b= 8//lado mas grande del trapezoide
                h=4//su altura

                return (((a+b)/2)*h)
        }
        function perimetro(){

            let l1=5
            let l2=6
            let l3=4
            let l4=5

            return (l1+l2+l3+l4)
        }

        switch(this._accion){

            case "area":
                
            return area()
            break
            case "perimetro":
            return perimetro()
            break
        }

    }

    formula_circulo(){

        function area(){

            let r=4
            let PI=3.14159
            let rpow= Math.pow(r,2);

            return PI*rpow
        }
        function perimetro(){
            let PI=3.14159
            let r=6
             return (2*PI*r)
        }
        function AreasectorCircular(){

            let PI=3.14159
            let r=9
            let grados=30
            let rpow=Math.pow(r,2)

            return PI*rpow*(grados/360)


        }
        function ladosectorCircular(){

            let PI=3.14159
            let r=9
            let grados=30
            

            return PI*r*(grados/180)


        }
        function coronaCircular(){
            let PI=3.14159
            let R=10
            let r=8
            let rpow=Math.pow(r,2)
            let Rpow=Math.pow(R,2)

            return PI*(Rpow-rpow)

        }
        function elipse(){
            let PI=3.14159
            let a=10
            let b=8

            return PI*a*b
        }

        switch(this._accion){

            case "area":
            return area()
            break
            case "perimetro":
            return perimetro()
            break
            case "area sector circular":
            return AreasectorCircular()
            break
            case "lado sector circular":
            return ladosectorCircular()
            break
            case "corona circular":
            return coronaCircular()
            break
            case "elipse":
            return elipse()
            break
        }

    }

    formula_triangulo(){
        function area(){

            let base=5
            let altura= 8

            return (base*altura)/2
        }
        function perimetro(){

            let a=4
            let b=3
            let c=6

            return a+b+c
        }
        function teoremaPitagoras(){

            let valor=false
            let hipotenusa, catetoA,catetoB;

            

            if(valor){
                catetoA=6
                catetoB=4
               
                
                return Math.sqrt((Math.pow(catetoA,2))+Math.pow(catetoB,2))
                
            }
            else{
                hipotenusa=10
                catetoA=4
                  
                return Math.sqrt((Math.pow(hipotenusa,2))-Math.pow(catetoA,2))

            }
            


        }
        function trianguloEquilatero(){


                function area(){
                    let lado=4
                    let ladopow=Math.pow(lado,2)
                    return ((ladopow)*(Math.sqrt(3)))/4
                }

                function altura(){
                    let lado=4
                    return (lado*Math.sqrt(3))/2
                }

                let desicion=false//aqui se debe de preguntar si desea el area o altura del tringulo equilatero
                    
                if (desicion)return area()
                else return altura()



                

        }
        switch(this._accion){

            case "area":
            return area()
            break
            case "perimetro":
            return perimetro()
            break
            case "teorema de piragoras":
            return teoremaPitagoras()
            break
            case "triangulo equilatero":
            return trianguloEquilatero()
            break
        }

    }
    
}

class formulas3d extends Formulas{
    constructor(nombre,accion,resultado){
        super(nombre)
        this._accion=accion
        this._resultado=resultado

        switch(nombre){

            case "paralelepipedo":
                this._resultado = this.paralelepipedo()
            break
            
            case "esfera":
                this._resultado = this.esfera()
            break
            
            case "cilindro":
                this._resultado = this.cilindro()
            break
            
            case "cono":
                this._resultado = this.cono()
            break
          
            case "tronco cono":
                this._resultado = this.troncoCono()
            break
        }
    }

    paralelepipedo(){

        function area(){
        let base=4
        let altura=3
        let profundidad=5

        return (2*(base*altura)+2*(base*profundidad)+2*(altura*profundidad))
        }
        function volumen(){
            let base=4
        let altura=3
        let profundidad=5

        return base*altura*profundidad

        }

        switch(this._accion){

            case "area":
            return area()
            break
            case "volumen":
                return volumen()
                break
        }
    }
    esfera(){
        function area(){
            let PI=3.14159
            let r=6
            let rpow=Math.pow(r,2)

            return (4*PI*rpow)
        
        }
        function volumen(){
            let PI=3.14159
            let r=9
            let rpow=Math.pow(r,3)

            return (4*PI*rpow)/3



        }

        switch(this._accion){

            case "area":
            return area()
            break
            case "volumen":
                return volumen()
                break
        }
    }
    cilindro(){
        function area(){
            let PI=3.14159
            let r=9
            let h=5

            return 2*PI*r*(r+h)
        }
        function volumen(){
            let PI=3.14159
            let r=9
            let h=5
            let rpow=Math.pow(r,2)

            return PI*rpow*h

        }

        switch(this._accion){

            case "area":
            return area()
            break
            case "volumen":
                return volumen()
                break
        }
    }
    cono(){
        function area(){
            let PI=3.14159
            let r=9
            let h=5
            let g=8
            let rpow=Math.pow(r,2)

            return PI*rpow+PI*r*g

        }
        function volumen(){
            let PI=3.14159
            let r=9
            let h=5
            let rpow=Math.pow(r,2)

            return (PI*rpow*h)/3

        }

        function g(){
            let r=9
            let h=5
            return Math.sqrt(Math.pow(r,2)+Math.pow(h,2))
            

        }

        switch(this._accion){

            case "area":
            return area()
            break
            case "volumen":
                return volumen()
                break
            case "altura cono":
                return g()
                break
        }
    }
    troncoCono(){
        
        function volumen(){

            let PI=3.14159
            let r=9
            let h=5
            let rpow=Math.pow(r,2)
            let R=10
            let Rpow=Math.pow(R,2)

            return ((PI*h)*(rpow+r*R+Rpow))/3

        }
        return volumen();
    }


    
}

    

//let nuevaFormula= new formulas2d("cuadrado","area")
//console.log(nuevaFormula)





let desicion=true


let newFormula= new Formulas()

if(desicion){
    
    newFormula= new formulas2d(newFormula.formulas2D,newFormula.accion2d)
    
    /*las clases suelen ser muy curiosas de usar ya que desde una sola linea de codigos puedo
                                                                        hacer que mi clase formula2d interactue con la variable newFormula y que esta misma pueda interactuar con
                                                                        los parametros de la misma variable newFormula pero agregando las clases de la madre "Formulas" 
                                                                        
                                                                        Asi que desde aqui comento que las clases es recomendable que tengan clases heredadas para que desde la clase madre
                                                                        se puedan establecer los patrones de comportamiento para como actuen las clase hijos*/
    console.log(newFormula.nombre)
    

}
else{
  
    newFormula= new formulas3d(newFormula.formulas3D,newFormula.accion3d)

    console.log(newFormula.nombre)
    
}
alert(newFormula._resultado)
console.log(newFormula)


    


