package abdelhakim.hacine.med.lib_chargily

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Instanceretrofit {
    companion object {

        private val retrofit by lazy {
//            val logging = HttpLoggingInterceptor()
//            logging.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client = OkHttpClient.Builder()
//               Could not resolve com.squareup.okhttp3:logging-interceptor:4.5.0.
                .build()

            Retrofit.Builder()
                .baseUrl("https://epay.chargily.com.dz")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
        }

        val api by lazy {
            retrofit.create(FunctionsInterfacePayment::class.java)
        }
    }
}