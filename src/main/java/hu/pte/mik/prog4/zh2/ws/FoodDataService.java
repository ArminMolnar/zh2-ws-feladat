package hu.pte.mik.prog4.zh2.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface FoodDataService {

    @WebMethod
    FoodDataResponse getFoodData(FoodDataRequest request);

}
