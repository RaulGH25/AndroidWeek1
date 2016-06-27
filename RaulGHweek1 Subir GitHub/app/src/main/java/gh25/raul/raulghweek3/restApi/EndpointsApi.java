package gh25.raul.raulghweek3.restApi;


import gh25.raul.raulghweek3.restApi.model.MascotaResponse;
import gh25.raul.raulghweek3.restApi.model.UsuarioResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Raul on 25/06/2016.
 */
public interface EndpointsApi {


    //@GET(ConstantsRestApi.URL_GET_USER_DATA_BY_ID)
    String urlmedia = "users/{id}/media/recent/?access_token=" + ConstantsRestApi.ACCESS_TOKEN;
    @GET(urlmedia)
    Call<MascotaResponse> getRecentMedia(@Path("id") String userid);


    //@GET(ConstantsRestApi.URL_GET_USER_INF_BY_NAME)
    String urlusuario = "users/search";
    @GET(urlusuario)
    Call<UsuarioResponse> getUserID(
            @Query("q") String userid,
            @Query("access_token") String tokem
    );

}

