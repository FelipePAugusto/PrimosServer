package primosserver;

import primosserver.WebMethod;
import primosserver.WebParam;
import primosserver.WebResult;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class Primos {
	 
	@WebMethod(operationName = "validador")
	@WebResult(name = "resultado_validador")
    private static boolean testandoPrimo(@WebParam(name = "parametro") int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
}
