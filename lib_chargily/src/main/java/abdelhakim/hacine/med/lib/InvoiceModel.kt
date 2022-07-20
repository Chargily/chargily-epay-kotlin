package abdelhakim.hacine.med.lib_chargily

import com.google.gson.annotations.SerializedName
import java.io.Serializable
//all fields are required
data class InnoviceModel(     @SerializedName("client")var client        : String,
                              @SerializedName("client_email")var client_email   : String,
                              @SerializedName("invoice_number")var invoice_number : String,
                              @SerializedName("amount")var amount        : Double,
                              @SerializedName("discount")var discount      : Double,
                              @SerializedName("back_url")var back_url       : String,
                              @SerializedName("webhook_url")var webhook_url    : String,
                              @SerializedName("mode")var mode          : PaymentMethode,
                              @SerializedName("comment")var comment       : String

)
{

}