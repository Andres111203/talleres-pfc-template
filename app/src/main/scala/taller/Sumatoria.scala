package taller
import scala.math._

class Sumatoria {
    

    def suma(i: Int, acc: Int, n: Int): Int = {

        if(i > n) acc
        else suma(i+1, acc + i*i, n)
    }

    def op(operador: String, inc: Int, i: Int, acc: Int, n: Int): Int = {

        if(i > n) acc
        else{
            operador match{

                case "*" => op(operador, inc, i + inc, acc * (i*i), n)
                case "+" => op(operador, inc, i + inc, acc + (i*i), n)
                case "-" => op(operador, inc, i + inc, acc - (i*i), n)
                case "/" => op(operador, inc, i + inc, acc / (i*i), n)
                case "**" => op(operador, inc, i + inc, pow(acc,pow(i,2)).toInt, n)
                case _ => throw new IllegalArgumentException("Operacion no reconocida")

            }
            
        }
    }

    
    def opCurrificada(operador: String)(inc: Int)(i: Int)(acc:Int)(n: Int): Int = {

        if(i > n) acc
        else{

            operador match{

                case "*" => opCurrificada(operador)(inc)(i + inc)(acc * (i*i))(n)
                case "+" => opCurrificada(operador)(inc)(i + inc)(acc + (i*i))(n)
                case "-" => opCurrificada(operador)(inc)(i + inc)(acc - (i*i))(n)
                case "/" => opCurrificada(operador)(inc)(i + inc)(acc / (i*i))(n)
                case "**" => opCurrificada(operador)(inc)(i + inc)(pow(acc,pow(i,2)).toInt)(n)
                case _ => throw new IllegalArgumentException("Operacion no reconocida")

            }


        }

        
    }


}
