package introduccion

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SumatoriaTest  extends AnyFunSuite {
  val objSum = new Sumatoria()

    
    test("Sumatoria de suma con incremento de 1 con n = 5") {
        assert(objSum.suma(1,0,5) == 35)
    }

    test("Sumatoria de suma con incremento de 1 con n = 5") {
        assert(objSum.op("-",2,1,0,5) == -35)
    }

    test("Sumatoria de suma con incremento de 1 con n = 5") {
        assert(objSum.opCurrificada("*")(2)(1)(1)(5) == 225)
    }

    
}