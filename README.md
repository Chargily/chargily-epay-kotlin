# chargily-epay-kotlin
Kotlin Library for Chargily ePay Gateway

I will add this to MAVEN As soon as possible

        // creat a client Instance
        val chargiliClient : Chargily = Chargily("Put your API KEY HERE ")
        


      //creat a invoice model 
      
        val invoice :InnoviceModel = 
        InnoviceModel("mohameed" ,"mohamed.hacine00@gmail.com" , "3545644" , 009999.4 , 7.5 ,"https://www.yourwebsite.com",
            "https://www.yourwebsite.com/purshase" , PaymentMethode.EDAHABIA ,"Hola ")
            

      GlobalScope.launch {
                var response =  chargiliClient.creatPayment(invoice)
                withContext(Dispatchers.Main){
                // this will open an app chooser for web Browser
                  startActivity(Intent(Intent.ACTION_VIEW).setData(Uri.parse(response.body()?.checkout_url.toString())))
                }

![Chargily ePay Gateway](https://raw.githubusercontent.com/Chargily/epay-gateway-php/main/assets/banner-1544x500.png "Chargily ePay Gateway")

 This Package is to integrate ePayment gateway with Chargily easily.
- Currently support payment by **CIB / EDAHABIA** cards and soon by **Visa / Mastercard** 
- This repo is recently created for **Android SDK**, If you are a developer and want to collaborate to the development of this Package, you are welcomed!

# Contribution tips
1. Make a fork of this repo.
2. Take a tour to our [API documentation here](https://dev.chargily.com/docs/#/epay_integration_via_api)
3. Get your API Key/Secret from [ePay by Chargily](https://epay.chargily.com.dz) dashboard for free.
4. Start developing.
5. Finished? Push and merge.

