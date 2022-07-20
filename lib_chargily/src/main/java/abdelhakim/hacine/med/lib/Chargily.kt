package abdelhakim.hacine.med.lib_chargily

import kotlinx.coroutines.*
import retrofit2.Response

class Chargily(val apiKey : String ) {


    // this one should be called in a coroutine scope
    suspend fun creatPayment(inVoice: InnoviceModel):Response<ChargilyResponse> {


    var serverResponse  = withContext(Dispatchers.IO) {


    async {

          Instanceretrofit.api.createInovice(apiKey , inVoice)
          }
                 }
        return serverResponse.await()
       }

}