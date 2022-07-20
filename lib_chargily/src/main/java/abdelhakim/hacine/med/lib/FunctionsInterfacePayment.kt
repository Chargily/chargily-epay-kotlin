package abdelhakim.hacine.med.lib_chargily

import retrofit2.Response
import retrofit2.http.*

interface FunctionsInterfacePayment {


//    @Headers(value = ["Content-Length: 5555","Content-Type: application/json",
//        "Accept: application/json"])
    @POST("/api/invoice")
    suspend fun createInovice(@Header("X-Authorization") apiKey:String,  @Body invoice: InnoviceModel): Response<ChargilyResponse>

}